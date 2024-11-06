package Day10;

public class Hari66 {

    public static void main(String[] args) {
        //Pola persegi dan Persegi panjang
        int a = 4;
        int b = 10;
        //pola persegi
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) { 
                System.out.print("* ");  
            }
            System.out.println();  
        }
        System.out.println("------------------------------");
        //pola persegi panjang
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
