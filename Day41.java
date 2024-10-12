package Day10;

import java.util.Scanner;

public class Hari41 {
 
    public static void main(String[] args) {
        
        //input dari keyboard
        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = yulia.nextInt();
        System.out.print("masukkan angka kedua: ");
     
        int angka2 = yulia.nextInt();
        //operator aritmatika
        int total1 = angka1 + angka2;
        System.out.println("Jumlahnya adalah: " + total1);
        int total2 = angka1 * angka2;
        System.out.println("Hasilnya kali: " + total2);
        int total3 = angka1 / angka2;
        System.out.println("Hasil bagi: " + total3);
        //operator penugasan 
        total3 += 4;
        System.out.println(total3);
        total1 *= 2;
        System.out.println(total1);
        //operator perbandingan 
        System.out.println(total3 < total2);
        System.out.println(total1 > total3);
    }

}
