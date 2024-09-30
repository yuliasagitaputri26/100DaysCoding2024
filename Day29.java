package Day10;

import java.util.Scanner;

public class Hari29 {

    public static void main(String[] args) {

        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan alas : ");
        int alas = yulia.nextInt();
        System.out.print("Masukkan Tinggi : ");
        int Tinggi = yulia.nextInt();
        System.out.print("Masukkan sisi kedua: ");
        int sisiKedua = yulia.nextInt();
        System.out.print("Masukkan sisi ketiga: ");
        int sisiKetiga = yulia.nextInt();

        //menghitung keliling dan luas 
        int keliling = alas + sisiKedua + sisiKetiga;
        int luas = (alas * Tinggi) / 2;

        System.out.println("keling : " + keliling);
        System.out.println("luas : " + luas);

    }

}
