package Ex2;

import java.util.Scanner;

public class PrintSquareTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
