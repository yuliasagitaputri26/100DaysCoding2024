package Day10;

import java.util.Scanner;

public class Aritmatika {

    public static void main(String[] args) {
        //Membuat sebuah inputan
        Scanner yulia = new Scanner(System.in);
        System.out.println("masukkan angka");

        int Panjang = yulia.nextInt();//(nextInt) untuk menginput nilai dengan tipe data int
        int lebar = yulia.nextInt();
        //Rumus untuk mencari luas dan keliling persegi panjang
        int luas = Panjang * lebar;
        int keliling = 2 * (Panjang + lebar);
        //Mencetak nilai menggunakan print format
        System.out.printf("luas dari persegi panjang adalah %d \n ", luas);
        System.out.printf("keliling dari persegi panjang adalah %d \n ", keliling);
    }

}
