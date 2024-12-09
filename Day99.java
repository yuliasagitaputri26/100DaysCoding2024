package Day10;

import java.util.Scanner;

public class Hari99 {

    public static void main(String[] args) {

        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan angka x: ");
        int x = yulia.nextInt();
        System.out.print("Masukkan angka y: ");
        int y = yulia.nextInt();

        int total = 0;

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                total += i;

            }
        }
        System.out.println("Jadi total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah " + total);

    }

}
