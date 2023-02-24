package Excercise;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        int rate = 23000;
        int USD;
        int VND;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter USD : ");
        USD = scanner.nextInt();
        VND = USD * rate;
        System.out.println("VND = " + VND);
    }
}
