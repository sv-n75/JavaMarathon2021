package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("grey");
        car.setYear(20);
        car.setModel("FFF");
        car.info();
        System.out.println("Возраст авто " + car.yearDifference(40));


        Motorbike motorbike = new Motorbike("GGG", "grey", 20);
        motorbike.info();
        System.out.println("Возраст мотоцикла " + motorbike.yearDifference(30));

    }
}
