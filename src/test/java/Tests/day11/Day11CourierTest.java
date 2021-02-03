package Tests.day11;

import Tests.AbstractTest;
import day11.task1.Courier;
import day11.task1.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.laughingpanda.beaninject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day11CourierTest extends AbstractTest {

    Warehouse w;
    Courier courier;

    @BeforeEach
    public void init() {
        w = new Warehouse();
        courier = new Courier(w);
    }

    @Test
    void doWorkOnceCourier() {
        courier.doWork();
        assertEquals(100, courier.getSalary(),
                "Однократный вызов метода doWork() на новом объекте Courier. Проверка поля salary");
    }

    @Test
    void doWorkOnceWarehouse() {
        courier.doWork();
        assertEquals(1, w.getCountDeliveredOrders(),
                "Однократный вызов метода doWork() на новом объекте Courier. Проверка поля countDeliveredOrders" +
                        " у Warehouse");
    }

    @Test
    void doWorkTwiceCourier() {
        courier.doWork();
        courier.doWork();
        assertEquals(200, courier.getSalary(),
                "Двукратный вызов метода doWork() на новом объекте Courier. Проверка поля salary");
    }

    @Test
    void doWorkTwiceWarehouse() {
        courier.doWork();
        courier.doWork();
        assertEquals(2, w.getCountDeliveredOrders(),
                "Двукратный вызов метода doWork() на новом объекте Courier. Проверка поля countDeliveredOrders" +
                        " у Warehouse");
    }

    @Test
    void bonusYes() {
        Inject.field("salary").of(courier).with(1000);
        Inject.field("countDeliveredOrders").of(w).with(10_000);
        courier.bonus();
        assertEquals(51_000, courier.getSalary(),
                "Расчет бонуса курьера при 10 000 countDeliveredOrders Warehouse, 1000 salary Courier");
    }

    @Test
    void bonusNo() {
        Inject.field("salary").of(courier).with(1000);
        Inject.field("countDeliveredOrders").of(w).with(8_000);
        courier.bonus();
        assertEquals("Бонус пока не доступен" + System.lineSeparator(), getOutput(),
                "Расчет бонуса курьера при 8 000 countDeliveredOrders Warehouse, 1000 salary Courier");

    }

    @Test
    void bonusTwice() {
        Inject.field("salary").of(courier).with(1000);
        Inject.field("isPayed").of(courier).with(true);
        Inject.field("countDeliveredOrders").of(w).with(11_000);
        courier.bonus();
        assertEquals("Бонус уже был выплачен" + System.lineSeparator(), getOutput(),
                "Расчет бонуса курьера при 11 000 countDeliveredOrders Warehouse, 1000 salary Courier, " +
                        "двукратном вызове bonus()");
    }
}