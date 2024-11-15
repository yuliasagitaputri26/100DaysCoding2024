package Day10;

import java.util.Scanner;

public class Hari75 {

    public static void main(String[] args) {

        //String method : toLowerCase
        
        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String Nama = yulia.nextLine(); 

        String a = Nama.toLowerCase();//mengubah huruf kapital menjadi huruf kecil
        System.out.println("Nama setelah LowerCase : " + a);
    }

}
