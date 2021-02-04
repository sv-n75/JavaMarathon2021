package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("A");
        cars.add("B");
        cars.add("C");
        cars.add("D");
        cars.add("e");
        System.out.println(cars);

        cars.add(3, "F");
        cars.remove(0);
        System.out.println(cars);


    }
}
