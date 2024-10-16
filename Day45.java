package Day10;

public class Hari45 {

    public static void main(String[] args) {
        //Menginisialisasi
        int angka1 = 12;
        int angka2 = 20;
        int pembanding = 5;
        
        //Melakukan Perbandingan
        boolean hasil = (angka1 >= pembanding) || (angka2 >= pembanding);
        boolean hasil1 = (angka2 <= pembanding) || (angka1 <= pembanding);
        //Mencetak Hasil
        System.out.println("hasil perbandingan: " + hasil);
        System.out.println("hasil perbandingan: " + hasil1);
    }

}
