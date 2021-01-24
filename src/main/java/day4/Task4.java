package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int []numbers = new int[100];
        int result = 0;
        int index = 0;

        for (int i = 0; i < 100; i++){
            numbers[i] = random.nextInt(10000);
        }

        for (int i = 0; i < 98; i++){
            int summa = numbers[i] + numbers[i+1] + numbers[i+2];
            if (summa >= result){
                result = summa;
                index = i;
            }
        }

        System.out.println(result);
        System.out.println(index);

    }
}
