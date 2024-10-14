package Day10;

import java.util.Scanner;

public class Hari43 {

    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        System.out.printf("Input Jari-jari   : ");
        int jari_jari = yu.nextInt();
        yu.nextLine();
        System.out.printf("Input satuan      : ");
        String satuan = yu.nextLine();
        
        final double PI = 3.14159;
        double keliling = 2 * PI * jari_jari;
        double luas = PI * jari_jari * jari_jari;

        System.out.println("==================HASIL==================");
        System.out.println("Jari-jari : " + jari_jari + " " + satuan);
        System.out.printf("Keliling  : %.5f \n", keliling, satuan);
        System.out.printf("Luas      : %.5f^2\n", luas, satuan);

    }

}
