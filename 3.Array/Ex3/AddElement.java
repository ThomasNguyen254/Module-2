package Ex3;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        int X;

        Scanner scanner = new Scanner(System.in);
        System.out.print( "Nhập vào giá trị muốn thêm : ");
        X = scanner.nextInt();

        int index = 2;
        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = arr.length - 2; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = X;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

