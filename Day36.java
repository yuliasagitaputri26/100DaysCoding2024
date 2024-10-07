package Day10;

import java.util.Scanner;

public class Hari36 {

    public static void main(String[] args) {
        //opearator aritmatika perkalian, pembagian serta modulus

        Scanner yu = new Scanner(System.in);

        System.out.print("Masukkan angka pertama:");
        float angka1 = yu.nextFloat();

        System.out.print("Masukkan angka kedua:");
        float angka2 = yu.nextFloat();

        System.out.println("Hasil perkalian: " + (angka1 * angka2));
        System.out.println("Hasil pembagian: " + (angka1 / angka2));
        System.out.println("Hasil modulu: " + (angka1 % angka2));
