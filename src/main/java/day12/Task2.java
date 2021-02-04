package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                integerList.add(index, i);
                index++;
            }
        }
        for (int i = 300; i < 350; i++) {
            if (i % 2 == 0) {
                integerList.add(index, i);
                index++;
            }
        }
        System.out.println(integerList);
    }
}
