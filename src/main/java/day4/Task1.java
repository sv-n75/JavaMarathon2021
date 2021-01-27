package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] numbers = new int[n];
        int more8 = 0;
        int equal1 = 0;
        int even = 0;
        int noEven = 0;
        int summa =0;


        for (int i = 0; i < n; i++){
            numbers[i] = random.nextInt(10);
            if (numbers[i]>8) more8++;
            if (numbers[i] == 1) equal1++;
            if (numbers[i]%2 == 0) even++;
            else noEven++;
            summa +=numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных 1: " + equal1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + noEven);
        System.out.println("Сумма всех элементов массива: " + summa);

    }
}
