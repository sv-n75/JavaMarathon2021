package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][]numbers = new int[12][8];
        int[]summa = new int[12];
        int result =0;
        int index = 0;
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[0].length; j++){
                numbers[i][j] = random.nextInt(50);
                summa[i] +=numbers[i][j];
            }
            if (summa[i] >= result){
                result = summa[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
