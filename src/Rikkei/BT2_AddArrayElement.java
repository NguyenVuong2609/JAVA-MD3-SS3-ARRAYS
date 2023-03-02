package Rikkei;

import java.util.Arrays;
import java.util.Scanner;

public class BT2_AddArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Phần tử trong mảng là:" + Arrays.toString(array));
        System.out.println("\nNhập vào số cần thêm: ");
        int number = sc.nextInt();
        System.out.println("Nhập vào vị trí cần thêm: ");
        int index = sc.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không thể thêm được phần tử!");
        } else {
            for (int i = array.length - 1; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index - 1] = number;
            System.out.println("New:" + Arrays.toString(array));
        }
    }
}
