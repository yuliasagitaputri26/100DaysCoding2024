package Day10;

import java.util.Scanner;

public class Hari18 {

    public static void main(String[] args) {
        //Operasi Aritmatika pengurangan dan penjumlahan 
        
        //Membuat objek Scanner untuk mengambil inputan dari pengguna 
        Scanner yulia = new Scanner(System.in);
        //mencetak menggunakan print untuk memasukkan angka pertama dalam bentuk baris
        System.out.print("Masukkan angka pertama : ");
        //digunakan untuk membaca input berupa bilangan bulat dari pengguna
        int angkapertama = yulia.nextInt();
        
        //mencetak menggunakan print untuk memasukkan angka kedua dalam bentuk baris
        System.out.print("Masukkan angka kedua : ");
        //digunakan untuk membaca input berupa bilangan bulat dari pengguna
        int angkaKedua = yulia.nextInt();
        
        //mencetak menggunakan print untuk memasukkan angka ketiga dalam bentuk baris
        System.out.print("Masukkan angka ketiga : ");
        //digunakan untuk membaca input berupa bilangan bulat dari pengguna
        int angkaKetiga = yulia.nextInt();
        
        //Operasi pengurangan dan penjumlahan 
        int Jumlah = angkapertama - angkaKedua + angkaKetiga;
        //mencetak nilai ke konsol
        System.out.println("Hasil dari " + angkapertama + " - " + angkaKedua + " + " + angkaKetiga + " = " + Jumlah);
    }

}
