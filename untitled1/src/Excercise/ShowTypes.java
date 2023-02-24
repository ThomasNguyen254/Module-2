package Excercise;

import java.util.Scanner;

// In hình chữ nhật
public class ShowTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length : ");
        int length = scanner.nextInt();

        System.out.print("Enter height : ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


