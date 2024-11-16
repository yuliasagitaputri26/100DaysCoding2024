package Day10;

import java.util.Scanner;

public class Hari76 {

    public static void main(String[] args) {
        
        //String Method : toUpperCase
        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String Nama = yulia.nextLine(); 

        String a = Nama.toUpperCase();//mengubah huruf kecil menjadi huruf kapital
        System.out.println("Nama setelah UpperCase : " + a);
    }
}
