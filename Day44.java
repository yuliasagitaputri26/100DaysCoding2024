package Day10;

import java.util.Scanner;

public class Hari44 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama: ");
        boolean a = yu.nextBoolean();
        System.out.print("Masukkan nilai kedua: ");
        boolean b = yu.nextBoolean();

        boolean hasil = a && b;
        System.out.println("Hasil dari: " + a + " dan " + b + " adalah " + hasil);
    }

}
