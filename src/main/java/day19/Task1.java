package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
//        1. В папке resources находится файл dushi.txt. Этот файл содержит в себе полный текст произведения
//        “Мертвые души” Н. В. Гоголя. Вам необходимо прочитать этот файл и, используя структуру данных HashMap,
//        подсчитать, сколько раз в этом произведении было использовано каждое слово. После того, как подсчет будет
//        произведен, вам необходимо вывести в консоль 100 самых часто используемых слов. Изучите вывод и посмотрите,
//        сколько раз в произведении было использовано слово “Чичиков” (фамилия главного героя). Это число выпишите в коде
//        в виде комментария (например: // Чичиков - 120).
//        Для того, чтобы класс Scanner считывал слова, разделяя текст по знакам препинания, используйте следующий код:
//
//        Scanner scanner = new Scanner(text); // в text находится файл dushi.txt
//        scanner.useDelimiter("[.,:;()?!\"\\s–]+");
        File file = new File("C:\\Users\\123\\Desktop\\Javanail\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        ArrayList<String> words = new ArrayList<String>();
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");
        HashMap<String, Integer> word = new HashMap<String, Integer>();

        while (scanner.hasNext()) {
            words.add(scanner.next());//создали массив слов
        }

//        for (int i= 0; i<words.size(); i++) { СЧИТАЕТ НО ОЧЕНЬ ОЧЕНЬ ДОЛГО
//            int count=0;
//            for (int j=0; j<words.size(); j++) {
//
//                if (words.get(i).equals (words.get(j)))//переборка слов
//                    count++;
//
//            }
//            word.put(words.get(i),count);
//        }//записали ключ значение
//        System.out.println("Чичиков " + word.get("Чичиков"));
        for (String s : words) {//завели в мапу
            word.put(s, word.getOrDefault(s, 0) + 1);
        }//в разы быстрее

        word.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

        System.out.println("Чичиков " + word.get("Чичиков"));
    }


}
