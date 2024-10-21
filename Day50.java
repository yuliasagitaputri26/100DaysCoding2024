package Day10;

import java.util.Scanner;

public class Hari50 {

    public static void main(String[] args) {

        // Percabangan: if - else if - else
        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = yulia.nextInt();

        if (angka > 0) {
            System.out.println("Angka Genap");

        } else if (angka < 0) {
            System.out.println("Angka Ganjil");
        } else {
            System.out.println("Angka Nol");
        }
    }

}
