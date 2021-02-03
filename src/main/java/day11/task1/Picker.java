package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }
    public String toString(){
        return "salary = " + salary + ", " + "isPayed = " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countP();
    }

    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountPickedOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        }
        if (warehouse.getCountPickedOrders() >= 10000){
            salary+=70000;
           isPayed = true;
        }


    }
}
