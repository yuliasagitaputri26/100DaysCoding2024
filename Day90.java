package Day10;

import java.util.Scanner;

public class Harii90 {

    public static double Luas(double a) {
        return a * a;
    }

    public static void main(String[] args) {
        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi : ");
        int a = yulia.nextInt();

        System.out.println("luas : " + Luas(a));
    }

}
