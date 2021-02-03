package day11.task1;

public class Warehouse {
    private static int countPickedOrders;
    private static int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    public String toString(){
        return "countPickedOrders = " + getCountPickedOrders() + ", " + "countDeliveredOrders = " + getCountDeliveredOrders();
    }
    public void countP(){

        countPickedOrders++;
    }
    public void countD(){

       countDeliveredOrders++;
    }
}
