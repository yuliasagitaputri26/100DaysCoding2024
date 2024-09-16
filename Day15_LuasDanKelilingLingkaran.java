package Day10;

import java.util.Scanner;

public class LuasDanKelilingLingkarang {

    public static void main(String[] args) {

        //Rumus Luas lingkaran = pi * r2
        //r = jari-jari
        //pi = 3.14
        //Rumus mencari keliling K = 2 * pi * r
        //K = keliling
        //pi = 3.14
        //r = jari-jari
        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan jari-jari dari Lingkarang : ");
        float r = yulia.nextFloat();

        float pi = 3.14f;//Deklarasi dan Inisialisasi nilai pi
        //Mencari Luas Lingkaran
        float Luas = pi * r * r;
        //Menampilkan hasil dari luas lingkaran tersebuat
        System.out.println("Luas dari Lingkaran adalah = " + Luas);

        //mencari Keliling Lingkaran
        float Keliling = 2 * pi * r;//
        //Menampilkan keliling dari lingkaran 
        System.out.println("Keliling Lingkaran diatas adalah = " + Keliling);

    }
}
