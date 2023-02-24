package Ex2;

import java.util.Scanner;

//In hình tam giác cân.
public class PrintAnIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter height : ");
        int height = scanner.nextInt();

        System.out.println("Enter width : ");
        int width = scanner.nextInt();
        width = height * 2 - 1;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (j >= height - i + 1 && j <= height + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
