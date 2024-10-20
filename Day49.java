package Day10;

import java.util.Scanner;

public class Hari49 {

    public static void main(String[] args) {

        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = yulia.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else if (angka % 2 != 0) {
            System.out.println("Ganjil");
        }
    }

}
