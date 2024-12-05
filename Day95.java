package Day10;

import java.util.Scanner;

public class Hari95 {

    public static void main(String[] args) {
        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int n = yulia.nextInt();

        System.out.println("Segitiga Siku-siku");
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i)); // Cetak * sebanyak i
        }

        System.out.println("Segitiga Siku-siku Terbalik");
        for (int i = n; i >= 1; i--) {
            System.out.println("*".repeat(i)); // Cetak * sebanyak i
        }
    }

}
