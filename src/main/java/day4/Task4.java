package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        int result = 0;
        int index = 0;
        int value = 3;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        for (int i = 0; i < numbers.length - (value - 1); i++) {
            int summa = 0;
            for (int j = i; j < i + value; j++) {
                summa += numbers[j];
            }
            if (summa >= result) {
                result = summa;
                index = i;
            }
        }
        System.out.println(result);
        System.out.println(index);
    }
}
