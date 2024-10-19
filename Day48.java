package Day10;

import java.util.Scanner;

public class Hari48 {

    public static void main(String[] args) {
        
        //Percabangan: if-else
        
         Scanner yulia = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = yulia.nextInt();
        
        if (nilai >= 70) {
            System.out.println("Lulus");
        }else{
            System.out.println("Tidak Lulus");
        }
    }

}
