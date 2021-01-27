package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("HHH", 1980, 8, 300);
        airplane.setYear(1985);
        airplane.setLength(9);
        airplane.fillUp(30);
        airplane.fillUp(50);
        airplane.info();

    }
}
