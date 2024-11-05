package Day10;

import java.util.Scanner;

public class Hari65 {

    public static void main(String[] args) {
        //Nested Loop
        Scanner yu = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = yu.nextInt();

        for (int i = angka; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
