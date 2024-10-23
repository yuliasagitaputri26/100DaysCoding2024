package Day10;

import java.util.Scanner;

public class Hari52 {

    public static void main(String[] args) {

        //Ternary
        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = yulia.nextInt();

        String hasil = (angka > 0) ? "Positif" : (angka < 0) ? "Negatif" : "Nol";
        System.out.println("Angka yang telah dimasukka adalah: " + hasil);
    }
}
