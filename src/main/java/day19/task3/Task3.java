package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
//        3. В папке resources находится файл taxi_cars.txt. Этот файл содержит в себе данные
//        о местоположении 500 машин такси (каждая машина такси находится на новой строке).
//
//        Формат данных в файле следующий:
//        id_машины координата_по_x координата_по_y
//
//        Каждая строка в файле содержит 3 целых числа, разделенных пробелами —
//        уникальный идентификатор машины такси, координата машины по оси X и координата машины
//        такси по оси Y. Значения каждой из координат находятся в диапазоне от 0 до 99.
//
//        Для вашего удобства, в пакете task3 реализованы два класса - Point и DisplayTaxiMap.
//        Класс Point необходим для представления точек с координатами x,y в нашей программе.
//        Местоположение машины такси — объект класса Point. Класс DisplayTaxiMap реализован с
//        помощью библиотеки javafx и показывает все машины такси, которые есть в файле taxi_cars.txt на
//        одном поле. Запустите метод main() в этом классе и изучите работу библиотеки javafx на этом примере
//        (это необязательно для выполнения этого задания, но будет полезно).
//
//                Вам необходимо считать строки из файла taxi_cars.txt в HashMap<Integer, Point>.
//                В качестве ключей используются id машин из файла, а в качестве значений используется объект
//                Point, созданный для двух координат текущей машины. После того, как все машины будут лежать
//                в объекте HashMap, вам необходимо запросить от пользователя 4 числа - координаты
//                квадрата (x1, y1, x2, y2). Первые два числа — координаты первой точки квадрата, вторые два
//                числа — координаты второй точки квадрата (см. картинку ниже).
//        На этой картинке видно, что квадрат задается двумя точками, которые вводятся пользователем
//        с клавиатуры. Синими квадратиками изображены машины такси, которые оказались внутри квадрата.
//
//                Для квадрата, введенного пользователем, вам необходимо, используя сформированный объект
//                HashMap<Integer, Point>, определить, какие машины попали внутрь этого квадрата.
//                Вам необходимо вывести в консоль идентификаторы машин, которые находятся внутри квадрата
//                и общее количество машин в квадрате. Машины, лежащие на грани квадрата, не учитываются.
//
//                Алгоритм должен работать для любого корректно введенного квадрата.
        File file = new File("C:\\Users\\123\\Desktop\\Javanail\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        Map<Integer, Point> cars = new HashMap<>();
        Map<Integer, Point> result = new HashMap<>();
        int count = 0;
        ArrayList<Point> carPoint = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] string = scanner.nextLine().split(" ");
            cars.put(Integer.parseInt(string[0]), new Point(Integer.parseInt(string[1]), Integer.parseInt(string[2])));
        }
        scanner.close();
        System.out.println("Введите координаты квадрата (x1, y1, x2, y2)");
        Scanner scanner1 = new Scanner(System.in);

        String[] strings = scanner1.nextLine().split(",");
        for (int i = Integer.parseInt(strings[0]) + 1; i < Integer.parseInt(strings[2]); i++) {
            for (int j = Integer.parseInt(strings[1]) + 1; j < Integer.parseInt(strings[3]); j++) {
                carPoint.add(new Point(i, j));
            }
        }

        for (Map.Entry entry : cars.entrySet()) {
            for (int i = 0; i < carPoint.size(); i++) {

                if (entry.getValue().equals(carPoint.get(i))) {
                    System.out.print(entry.getKey() + " ");
                    count++;
                }
            }
        }
        scanner1.close();
        System.out.println();
        System.out.println("Число машин " + count);
    }
}

