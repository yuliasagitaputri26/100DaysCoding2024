package Day10;

import java.util.Scanner;

public class Hari47 {

    public static void main(String[] args) {
        
        //Percabangan if

        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = yulia.nextInt();
        
        if (nilai >= 85) {
            System.out.println("Nilai A");
        }
        if (nilai >= 70 && nilai < 85) {
            System.out.println("Nilai B");
        }
        if (nilai >= 55 && nilai < 70) {
            System.out.println("Nilai C");
        }
        if (nilai < 55) {
            System.out.println("Nilai D");
        }
    }

}
