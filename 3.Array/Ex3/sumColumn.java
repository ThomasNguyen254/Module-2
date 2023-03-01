package Ex3;

import java.util.Scanner;

public class sumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns of the array: ");
        int cols = scanner.nextInt();

        double[][] arr = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element at position [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("The input array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Enter the index of the column to sum (starting from 0): ");
        int column = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column];
        }

        System.out.println("The sum of the elements in column " + column + " is " + sum);
    }
}
