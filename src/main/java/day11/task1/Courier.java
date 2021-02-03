package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;


    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;



    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "salary = " + salary + ", " + "isPayed = " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countD();

    }

    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;
        }

            salary+=50000;
            isPayed = true;

    }
}
