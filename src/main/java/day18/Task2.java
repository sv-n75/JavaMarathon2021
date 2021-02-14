package day18;

public class Task2 {
//    Создайте рекурсивный метод, который принимает на вход единственный аргумент - число,
//    и возвращает количество цифр 7 в этом числе. Циклы использовать запрещено, можно использовать
//    только рекурсивные вызовы.
//
//            Пример:
//            System.out.println(count7(717771237)); // 5
//
//*В числе 717771237 ровно 5 раз используется цифра семь.


    public static void main(String[] args) {
        int n = 717771237;
        System.out.println(count7(n));
    }

    public static int count7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }
}
