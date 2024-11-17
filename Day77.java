package Day10;

import java.util.Scanner;

public class Hari77 {

    public static void main(String[] args) {

        //String method : equals
        Scanner yulia = new Scanner(System.in);

        String username = "Yulia";
        String password = "12345";
        
        System.out.print("Masukkan username: ");
        String Username = yulia.nextLine();

        System.out.print("Masukkan password: ");
        String Password = yulia.nextLine();

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("Login berhasil!");
            
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }

    }

}
