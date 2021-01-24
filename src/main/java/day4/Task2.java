package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int max = 0;
        int min = 10000;
        int a = 0;
        int summa = 0;
        Random random = new Random();
        int[]numbers = new int[100];
        for (int i = 0; i < 100; i++){
            numbers[i] = random.nextInt(10000);
        }

        for (int i: numbers) {
          if (i > max) max = i;
          if (i < min) min = i;
          if (i%10 == 0){
              a++;
              summa +=i;
          }
        }

        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + a);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + summa);

    }
}
