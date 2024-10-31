package Day10;

import java.util.Scanner;

public class Hari60 {

    public static void main(String[] args) {
        //Looping : do while

        Scanner yulia = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka: ");
            angka = yulia.nextInt();
        } while (angka != 0);

        System.out.println("Program selesai.");

    }
}
