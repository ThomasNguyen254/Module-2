package Ex3;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[2];

        Scanner input = new Scanner(System.in);

        System.out.println("Nhập giá trị cho mảng số nguyên thứ nhất:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("array1[" + i + "] = ");

            array1[i] = input.nextInt();
        }

        System.out.println("Nhập giá trị cho mảng số nguyên thứ hai:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = input.nextInt();
        }

        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        System.out.println("Mảng thứ ba sau khi gộp hai mảng:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}

