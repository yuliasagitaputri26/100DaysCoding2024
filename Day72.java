package Day10;

public class Hari72 {
    //Method Rekursif

    public static int faktorial(int n) {
        return (n <= 1) ? 1 : n * faktorial(n - 1);
    }

    public static void main(String[] args) {
        int angka = 5;
        System.out.println(faktorial(angka));

    }

}
