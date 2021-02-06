package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {
        File file = new File("people");

//        Создать в папке проекта файл people.txt в котором хранятся имена и возраст
//        людей. Реализовать статический метод
//        List<String> parseFileToStringList(File file), который считывает
//        содержимое этого файла и возвращает список, состоящий из значений имен
//        и возрастов каждого человека. Получить данный список в методе main() и
//        распечатать его в консоль.
//                В случае, если файла не существует в папке проекта, в
//                программе необходимо выбрасывать исключение и выводить в консоль
//                сообщение “Файл не найден”. Помимо этого, если значение возраста
//                отрицательно, необходимо выбрасывать исключение, выводить в консоль
//                сообщение “Некорректный входной файл” и возвращать null или пустой
//                список.
//
//
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException, IllegalArgumentException {
        List<String> listName = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                String[] strings1 = string.split(" ");
                int i = Integer.parseInt(strings1[1]);
                listName.add(string);
                if (i < 0) {
                    try {
                        listName.clear();
                        throw new IllegalArgumentException();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Некорректный входной файл");
                    }
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return listName;
    }

}
