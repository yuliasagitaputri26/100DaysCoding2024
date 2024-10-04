package Day10;

public class Hari33 {

    public static void main(String[] args) {
        //Tipe casting dari tipe data byte ke tipedata char
        byte nilaiByte = 65;//menggunakan kode ASCII 65-90(A-Z), 97-122(a-z)
        char nilaiChar = (char) nilaiByte;

        System.out.println("Nilai dari awal byte : " + nilaiByte);
        System.out.println("Nilai setelah casting ke tipedata char: " + nilaiChar);

    }

}
