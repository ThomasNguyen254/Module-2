package Ex3;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        double[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0};

        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị cần xoá: ");
        double x = sc.nextDouble();

        // Tìm vị trí của phần tử cần xoá
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }

        // Xoá phần tử cần xoá (nếu có) và dịch chuyển các phần tử phía sau về trước
        if (index_del != -1) {
            for (int i = index_del; i < arr.length - 1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = 0;  // Gán giá trị mặc định cho vị trí cuối cùng
            System.out.println("Mảng mới sau khi xoá " + x + ": " + Arrays.toString(arr));
        } else {
            System.out.println("Không tìm thấy giá trị cần xoá trong mảng");
        }

        // Đóng đối tượng Scanner
        sc.close();
    }
}
