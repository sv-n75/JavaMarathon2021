package day8;

public class Task1 {

    public static void main(String[] args) {
        String string = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200; i++) {
            string = string + i + " ";
        }
        long finish = System.currentTimeMillis() - start;
        //System.out.println(string);
        System.out.println(finish);

        StringBuilder stringBuilder = new StringBuilder();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 200; i++) {
            stringBuilder = stringBuilder.append(i + " ");
        }
        long finish2 = System.currentTimeMillis() - start2;
        //System.out.println(stringBuilder);
        System.out.println(finish2);
    }
}
