package Day10;

import java.util.Scanner;

public class Hari59 {

    public static void main(String[] args) {
        //Looping : For Each

        Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = yulia.nextLine();

        for (char a : nama.toCharArray()) {
            System.out.println("karakter: " + a);

        }

    }
}
