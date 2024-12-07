package Day10;

import java.util.Scanner;

public class Hari97 {

    public static void main(String[] args) {

        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = yulia.nextInt();

        System.out.print("Bilangan prima dari 1 sampai " + n + " adalah: ");
        for (int i = 2; i <= n; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //untuk memeriksa bilangan prima
    public static boolean isPrima(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

}
