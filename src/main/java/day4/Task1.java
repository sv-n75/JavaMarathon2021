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
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int summa =0;


        for (int i = 0; i < n; i++){
            numbers[i] = random.nextInt(10);
            if (numbers[i]>8) a++;
            if (numbers[i] == 1) b++;
            if (numbers[i]%2 == 0) c++;
            else d++;
            summa +=numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + a);
        System.out.println("Количество чисел равных 1: " + b);
        System.out.println("Количество четных чисел: " + c);
        System.out.println("Количество нечетных чисел: " + d);
        System.out.println("Сумма всех элементов массива: " + summa);

    }
}
