package Rikkei;

import java.util.Arrays;
import java.util.Scanner;

public class TH1_Swap {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài của mảng:");
            size = sc.nextInt();
            if (size > 10)
                System.out.println("Độ dài không được quá 10.");
        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Phần tử trong mảng là: ", " ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Phần tử trong mảng mới sau khi đảo là: ", " ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
