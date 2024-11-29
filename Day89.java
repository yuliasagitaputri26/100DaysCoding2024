package Day10;

import java.util.Scanner;

public class Hari89 {

    public static void main(String[] args) {
        //Soal 2
        Scanner yulia = new Scanner(System.in);
        
        System.out.print("Masukkan kata Palindrome : ");
        String kata = yulia.nextLine();

        if (kata.length() > 100) {
            System.out.println("Input maksimal 100 karakter");
        } else {
            String membalik = new StringBuilder(kata).reverse().toString();

            if (kata.equals(membalik)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}

