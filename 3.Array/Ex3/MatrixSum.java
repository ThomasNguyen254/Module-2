package Ex3;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][i];
        }
        System.out.println("Tổng các phần tử trên đường chéo chính là : " + total);

        int n;
        do {
            System.out.println("Nhập kích thước của mảng : ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("Kích thước phải lớn hơn 1 hoặc bằng 1. ");
            }
        } while (n < 1);

        double[][] inputMatrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập giá trị tại hàng : " + i + 1 + " và tại cột :" + j + 1);
                inputMatrix[i][j] = scanner.nextDouble();
            }
        }
        total = 0;
        for (int i = 0; i < n; i++) {
            total += inputMatrix[i][i];
        }
        System.out.println("Tổng các phần trên đường chéo chính của ma trận  : " + total);
    }
}
