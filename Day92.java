package Day10;

import java.util.Scanner;

public class Hari92 {

    public static void main(String[] args) {

        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris : ");
        int angka = yulia.nextInt();

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i != angka - 1) {
                for (int j = 0; j < (2 * (angka - i - 1) - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
