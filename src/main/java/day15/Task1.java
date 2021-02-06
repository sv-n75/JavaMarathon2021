package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\123\\Desktop\\Javanail\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        PrintWriter pw = new PrintWriter("C:\\Users\\123\\Desktop\\Javanail\\JavaMarathon2021\\src\\main\\resources\\missing_shoes");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                String[] strings = string.split(";");
                int number = Integer.parseInt(strings[strings.length - 1]);
                if (number == 0) {
                    pw.println(string);
                }
            }
            scanner.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println();
        }
    }
}
