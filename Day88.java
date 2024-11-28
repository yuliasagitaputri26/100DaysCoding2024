package Day10;

import java.util.Scanner;

public class Hari88 {

    public static void main(String[] args) {

        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan jari-jari : ");
        double jariJari = yulia.nextDouble();

        System.out.print("Masukkan tinggi : ");
        double tinggi = yulia.nextDouble();

        double phi = 3.14159 ;

        // Rumus volume tabung
        double volume = phi * jariJari * jariJari * tinggi;
        System.out.printf("%.2f m kubik%n", volume);

    }

}
