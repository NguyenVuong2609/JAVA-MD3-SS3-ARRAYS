package Rikkei;

import java.util.Scanner;

public class BT7_SumMatrixCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int collumn;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 99) + 1;
            }
        }
        System.out.println("Cột 1\t" + "Cột 2\t" + "Cột 3\t" + "Cột 4\t" + "Cột 5\t");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + matrix[i][j] + "\t\t");
            }
            System.out.println(" ");
        }
        for (int i = 0, j = 4; i < 5; i++, j--) {
            sum1 += matrix[i][i];
            sum2 += matrix[i][j];
        }
        System.out.println("Tổng của hàng chéo 1 là: " + sum1);
        System.out.println("Tổng của hàng chéo 2 là: " + sum2);

    }
}
