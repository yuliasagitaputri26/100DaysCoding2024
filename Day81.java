package Day10;

import java.util.Scanner;

public class Hari81 {

    public static void main(String[] args) {
        //String method : valueOf

        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = yulia.nextInt();

        String ubah = String.valueOf(angka);
        System.out.println("Nilai setelah diubah : " + ubah);
    }

}
