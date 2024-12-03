package haripertama;

import java.util.Scanner;

public class Hari93 {

    public static void main(String[] args) {

        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int angka = yulia.nextInt();

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < 2 * angka - 1; j++) {
                // cetak '*' pada posisi yang sesuai untuk membentuk pola V terbalik
                if (j == (angka - 1 - i) || j == (angka - 1 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
