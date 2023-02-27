package Ex2;

import java.util.Scanner;

// Hiển thị 20 số nguyên tố đầu tiên
public class first20Primes {
    public static void main(String[] args) {
        int numbers = 2;
        int count = 0;

        while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(numbers); i++) {
                if(numbers % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(numbers + " ");
                count++;
            }
            numbers++;
        }
    }
}
