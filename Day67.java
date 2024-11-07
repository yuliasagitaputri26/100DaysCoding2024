package Day10;

public class Hari67 {

    // Method void 
    //pola segitiga
    public void cetakPola(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hari67 contoh = new Hari67();

        contoh.cetakPola(5);
    }
}
