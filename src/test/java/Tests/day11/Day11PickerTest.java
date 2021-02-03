package Tests.day11;

import Tests.AbstractTest;
import day11.task1.Picker;
import day11.task1.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.laughingpanda.beaninject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day11PickerTest extends AbstractTest {

    Warehouse w;
    Picker picker;

    @BeforeEach
    public void init() {
        w = new Warehouse();
        picker = new Picker(w);
    }

    @Test
    void doWorkOncePicker() {
        picker.doWork();
        assertEquals(80, picker.getSalary(),
                "Однократный вызов метода doWork() на новом объекте Picker. Проверка поля salary");
    }

    @Test
    void doWorkOnceWarehouse() {
        picker.doWork();
        assertEquals(1, w.getCountPickedOrders(),
                "Однократный вызов метода doWork() на новом объекте Picker. Проверка поля countPickedOrders" +
                        " у Warehouse");
    }

    @Test
    void doWorkTwice() {
        picker.doWork();
        picker.doWork();
        assertEquals(160, picker.getSalary(),
                "Двукратный вызов метода doWork() на новом объекте Picker. Проверка поля salary");
    }

    @Test
    void doWorkTwiceWarehouse() {
        picker.doWork();
        picker.doWork();
        assertEquals(2, w.getCountPickedOrders(),
                "Двукратный вызов метода doWork() на новом объекте Picker. Проверка поля countPickedOrders " +
                        "у Warehouse");
    }

    @Test
    void bonusYes() {
        Inject.field("salary").of(picker).with(1000);
        Inject.field("countPickedOrders").of(w).with(10_000);
        picker.bonus();
        assertEquals(71_000, picker.getSalary(),
                "Расчет бонуса сборщика при countPickedOrders = 10 000 (Warehouse), salary = 1000 (Picker)");
    }

    @Test
    void bonusNo() {
        Inject.field("salary").of(picker).with(1000);
        Inject.field("countPickedOrders").of(w).with(8_000);
        picker.bonus();
        assertEquals("Бонус пока не доступен" + System.lineSeparator(), getOutput(),
                "Расчет бонуса сборщика при countOrders = 8 000 (Warehouse), salary = 1000 (Picker)");
    }

    @Test
    void bonusTwice() {
        Inject.field("salary").of(picker).with(1000);
        Inject.field("isPayed").of(picker).with(true);
        Inject.field("countPickedOrders").of(w).with(11_000);
        picker.bonus();
        assertEquals("Бонус уже был выплачен" + System.lineSeparator(), getOutput(),
                "Расчет бонуса сборщика при 11 000 countDeliveredOrders Warehouse, 1000 salary Picker, " +
                        "двукратном вызове bonus()");
    }
}