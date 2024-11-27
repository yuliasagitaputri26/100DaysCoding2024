package Day10;

import java.util.Scanner;

public class Hari87 {

    public static void main(String[] args) {
        //Mengubah nilai Array saru dimensi pada index tertentu
        int angka[] = {10, 20, 30, 40, 50};
        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan index yang ingin diubah : ");
        int a = yulia.nextInt();
        System.out.print("Masukkan nilai baru: ");
        int b = yulia.nextInt();
        
        angka[a] = b;
        System.out.println("Nilai Index setelah diubah: " + angka[0] + " " + angka[1] + " " + angka[2] + " " + angka[3] + " " + angka[4]);

    }

}
