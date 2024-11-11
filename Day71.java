package Day10;

public class Hari71 {

    //Method Static
    public static int hitungKuadrat(int angka) {
        return angka * angka;
    }

    public static void main(String[] args) {
        int angka = 2;
        int hasil = hitungKuadrat(angka);

        System.out.println("Hasil Kuadrat dari " + angka + " adalah " + hasil);
    }
}
