package Day10;

import java.util.Scanner;

public class Hari54 {

    public static void main(String[] args) {

        //Loping: for increment
        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = yulia.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }

      
    }
}
