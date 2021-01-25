package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(202, "SSS", "red");
        System.out.println("Год выпуска " + motorbike.getYear());
        System.out.println("Модель " + motorbike.getModel());
        System.out.println("Цвет " + motorbike.getColor());

    }
}
