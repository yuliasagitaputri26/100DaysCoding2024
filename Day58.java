package Day10;

import java.util.Scanner;

public class Hari58 {

    public static void main(String[] args) {

        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = yulia.nextInt();

        while (angka >= 1) {
            System.out.println(angka);
            angka --;
        }
    }

}
