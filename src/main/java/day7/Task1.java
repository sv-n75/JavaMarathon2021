package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("AAA", 2000, 70, 40);
        Airplane airplane2 = new Airplane("BBB", 2010, 40, 200);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}