package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
//        2. Реализовать программу, записывающую числа разных типов в 2 файла.
//                Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
//        Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.
//
//
//                Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
//        Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
//                Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается
//                их среднее арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2
//                будет находиться 50 вещественных чисел (1000 / 20 = 50).
//                После того, как Файл 2 будет сформирован, необходимо реализовать статический метод
//                printResult(File file). Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и
//                вывести её в консоль, отбросив вещественную часть.
        PrintWriter pw = new PrintWriter("file1");
        PrintWriter pw1 = new PrintWriter("file2");
        int max = 100;
        int summa = 0;

        for (int i = 0; i < 1000; i++) {
            int number = (int) (Math.random() * max);
            summa += number;
            pw.print(number);
            pw.print(" ");

            if (((i + 1) % 20) == 0) {
                double middle = (double) summa / 20;
                summa = 0;
                pw1.print(middle);
                pw1.print(" ");
            }
        }
        pw.close();
        pw1.close();
        File file1 = new File("file2");
        printResult(file1);
    }

    public static void printResult(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        double result = 0;
        String[] strings = scanner.nextLine().split(" ");
        for (String s : strings) {
            result += Double.parseDouble(s);
        }
        scanner.close();
        System.out.println((int) result);
    }
}

