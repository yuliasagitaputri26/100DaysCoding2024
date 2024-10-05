package Day10;

import java.util.Scanner;

public class Hari34 {
    
    public static void main(String[] args) {
        //input dari keyboard
      
        Scanner yu = new Scanner(System.in);
     
        System.out.print("Masukkan nama hewan mamalia: ");
        String nama = yu.nextLine();

        System.out.print("Masukkan habitat: ");
        String habitat = yu.nextLine();

        System.out.print("jenis makanan: ");
        String makanan = yu.nextLine();

        System.out.println("------------------------------------------");

        System.out.println("Mamalia");
        System.out.println("Nama: " + nama);
        System.out.println("Habitat: " + habitat); 
        System.out.println("Jenis Makanan: " + makanan);

    }

}
