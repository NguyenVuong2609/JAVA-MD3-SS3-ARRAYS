package Rikkei;

import java.util.Arrays;
import java.util.Scanner;

public class BT3_MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[5];
        int i = 0;
        int j = 0;
        while (i < arr1.length) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " mảng 1:");
            arr1[i] = sc.nextInt();
            i++;
        }
        while (j < arr2.length) {
            System.out.println("Nhập vào phần tử thứ " + (j + 1) + " mảng 2:");
            arr2[j] = sc.nextInt();
            j++;
        }
        System.out.println("Mảng 1: " + Arrays.toString(arr1));
        System.out.println("Mảng 2: " + Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println("Mảng 3 trước khi gộp: " + Arrays.toString(arr3));
        for (int k = 0; k < arr1.length; k++) {
            arr3[k] = arr1[k];
        }
        for (int k = 0, l = arr1.length; k < arr2.length; k++, l++) {
            arr3[l] = arr2[k];
        }
        System.out.println("Mảng 3 sau khi gộp: " + Arrays.toString(arr3));
    }
}
