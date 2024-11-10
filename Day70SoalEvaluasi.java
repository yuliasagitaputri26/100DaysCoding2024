package Day10;

import java.util.Scanner;//Menginport kelas scanner untuk mengambil inputan

public class Hari70Soal {

    public static void cetakPola1(int tinggi) {//Method yang digunakan untuk menampilkan Pola 1
        for (int i = 0; i < tinggi; i++) {//Perulangan untuk setiap baris

            for (int j = 0; j < tinggi - i; j++) {//Perulangan untuk Mencetak spasi agar pola berbentuk segitiga
                System.out.print(" ");//Mencetak Spasi
            }
            int angka = 1;//menginisialisasi tipe data int dengan nama variabel angka dengan nilai 1 pda baris pertama
            for (int j = 0; j <= i; j++) {//Baris ini yaitu Perulangan untuk mencetak angka pada setiap baris
                System.out.print(angka + " ");//Mencetak variabel angka dengan spasi
                angka = angka * (i - j) / (j + 1);//Pada baris ini kita Menghitung angka selanjutnya menggunakan rumus binomial
            }
            System.out.println();//pada baris ini untuk pindah kebaris baru 
        }
    }

    public static void cetakPola2(int tinggi) {//Method yang digunakan untuk menampilakan pola 2
        for (int i = tinggi; i >= 1; i--) {//Pada baris ini yaitu Perulangan untuk setiap baris 
            for (int j = 0; j < tinggi - i; j++) {//Baris ini yaitu Mencetak spasi agar pola berbentuk segitiga terbalik
                System.out.print(" ");//Mencetak spasi
            }
            for (int j = tinggi - 1; j >= tinggi - i; j--) {// Perulangan untuk mencetak angka yang berkurang
                System.out.print(j + " ");//Mencetak variabel J dengan spasi
            }
            System.out.println();//Pada baris ini yaitu untuk pindah kebaris baru
        }
    }

    public static void main(String[] args) {//Untuk masuk kedalam program/untuk menjalankan sebuah program
        Scanner yulia = new Scanner(System.in);//pada baris ini saya membuat obejk scanner dengan nama yulia untuk mengabil input dari pengguna

        System.out.print("Masukkan tinggi pola: ");//mencetak pesan masukkan tinggi pola dalam bentuk baris
        int tinggi = yulia.nextInt();//membaca input tinggi pola 

        System.out.println("Pola 1:");//mencetak teks pola 1
        cetakPola1(tinggi); //Memanggil method cetakPola1 untuk mencetak Pola 1

        System.out.println("\nPola 2:");//mencetak teks pola 2 (\n)agar pola 1 dan 2 itu berjarak 
        cetakPola2(tinggi);//memanggil method cetakPola2 untuk mencetak  pola 2

    }
}
