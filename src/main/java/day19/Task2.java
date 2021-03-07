package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
//        2. В папке resources находится файл numbers19.txt. Этот файл содержит в себе 500.000
//        случайных целых чисел от 1 до миллиарда (каждое число находится на новой строке).
//        Вам необходимо прочитать этот файл и, используя структуру данных HashSet, подсчитать, сколько чисел
//        из файла лежат в диапазоне от 500.000.000 до 600.000.000 включительно. Количество таких чисел необходимо
//        вывести в консоль. Вы можете попробовать решить эту задачу с помощью ArrayList’а и убедиться, что с помощью
//        этой структуры данных задача не решается за разумное время. Поэтому, необходимо использовать структуру
//        данных HashSet, которая позволяет мгновенно проверять наличие конкретного элемента внутри себя благодаря
//        процедуре хэширования (см. урок про устройство HashMap).
        File file = new File("C:\\Users\\123\\Desktop\\Javanail\\JavaMarathon2021\\src\\main\\resources\\numbers19.txt");
        Scanner scanner = new Scanner(file);
        
        HashSet<Integer> number = new HashSet<>();// через сет не совсем корректно одинаковые цифры перезапишутся

        while (scanner.hasNextLine()) {
            number.add(Integer.parseInt(scanner.nextLine()));
        }
        int count = 0;
        Iterator<Integer> iter = number.iterator();
        while (iter.hasNext()) {

            //System.out.println(iter.next());
            int s = iter.next();

            if (s >= 500000000 && s <= 600000000) {
                count++;
            }
        }
        System.out.println(count);

//        ArrayList<Integer>arrayList = new ArrayList<>();// цифры одинаковые по скорости по моему быстрее даже
//        while (scanner.hasNextLine()){
//            arrayList.add(Integer.parseInt(scanner.nextLine()));
//        }
//        int s = 0;
//        for (int i = 0; i < arrayList.size(); i++){
//           if (arrayList.get(i) >= 500000000 && arrayList.get(i) <= 600000000) s++;
//        }
//        System.out.println(s);
    }
}
