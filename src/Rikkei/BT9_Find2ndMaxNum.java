package Rikkei;

import java.util.Arrays;

public class BT9_Find2ndMaxNum {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 99) + 1;
        }
        System.out.println("Your Array: " + Arrays.toString(array));
        int indexMax1 = 0;
        int indexMax2 = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[indexMax1] < array[i]){
                indexMax2 = indexMax1;
                indexMax1 = i;
            } else if (array[indexMax2] <= array[i] ){
                indexMax2 = i;
            }
        }
        System.out.println("Max 1: " + array[indexMax1] + " Max 2: " + array[indexMax2]);
    }
}
