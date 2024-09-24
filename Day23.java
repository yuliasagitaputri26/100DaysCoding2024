package Day10;

import java.util.Scanner;

public class Hari23 {

    public static void main(String[] args) {

        //Operator penugasan untuk menghitung luas persegi
        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        int sisi = yulia.nextInt();
        int luas = 0;
        luas += sisi * sisi;
        System.out.println("luas dari persegi adalah : " + luas);

    }

}
