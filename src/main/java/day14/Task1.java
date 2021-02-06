package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException, NotTenException {
        File file = new File("C:\\Users\\123\\Desktop\\text1.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) throws FileNotFoundException, NotTenException {
        try {
            Scanner scannerFile = new Scanner(file);
            String line = scannerFile.nextLine();
            String[] nunberString = line.split(" ");
            int[] numbers = new int[nunberString.length];
            int summa = 0;

            if (numbers.length != 10) {
                throw new NotTenException("Некорректный ввод файла");
            }


            for (int i = 0; i < nunberString.length; i++) {
                numbers[i] = Integer.parseInt(nunberString[i]);
                summa += numbers[i];
            }
            System.out.println(summa);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}

