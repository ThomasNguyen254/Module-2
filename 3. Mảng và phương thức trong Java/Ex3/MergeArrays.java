package Ex3;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        int[] array1 = new int[3];
        int[] array2 = new int[2];

        // Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng
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

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] array3 = new int[array1.length + array2.length];

        // Bước 4: Duyệt các phần tử trong mảng 1 và gán vào từng phần tử trong mảng thứ 3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Duyệt các phần tử trong mảng 2 và gán vào từng phần tử tiếp theo trong mảng thứ 3
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // In ra mảng thứ 3 đã được gộp
        System.out.println("Mảng thứ ba sau khi gộp hai mảng:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}

