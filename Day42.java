package Day10;

import java.util.Scanner;

public class Hari42 {

    public static void main(String[] args) {

        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan angka1: ");
        int angka1 = yulia.nextInt();
        System.out.print("Masukkan angka2: ");
        int angka2 = yulia.nextInt();

        System.out.println("Apakaah angka 1 sama dengan angka 2 ? : " + (angka1 == angka2));
        System.out.println("Apakaah angka 1 sama tidak sama dengan angka 2 ? : " + (angka1 != angka2));
    }

}
