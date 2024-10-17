package Day10;
import java.util.Scanner;
public class Hari46 {

    public static void main(String[] args) {

        //operator logika : Negasi/Kebalikan

        Scanner yulia = new Scanner(System.in);
        System.out.print("Masukkan nilai:  ");
        boolean nilai = yulia.nextBoolean();
        System.out.println(nilai);

        boolean Negasi = !nilai;//melakukan negasi
        System.out.println("Nilau setelah Negasi: " + Negasi);
    }
}
