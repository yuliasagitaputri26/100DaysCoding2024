package Day10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Day13 {

    public static void main(String[] args) {
        //Inisialisasi semua tipe data
        String a = "lala";
        int b = 19;
        char c = 'P';
        byte d = 100;
        long e = 70L;
        float f = 50.1f;
        double g = 160.1;
        short h = 80;
        boolean i = true;
        //Mencetak menggunakan print format(printf)
        System.out.printf("Nama saya %s \n", a);
        System.out.printf("Umur saya %d \n", b);
        System.out.printf("Jenis kelamin %c \n", c);
        System.out.printf("Nilai byte adalah %d \n", d);
        System.out.printf("Nilai dari long adlah %s \n", e);
        System.out.printf("Berat badan saya %.2f \n", f);
        System.out.printf("Tinggi badan %.2f \n", g);
        System.out.printf("Nilai dari short adalah %d \n", h);
        System.out.printf("Data diatas %b \n", i);

        System.out.println("------------------------------------------------");

        //Tipe data reference
        String nama = "lili";
        System.out.println("Nama = " + nama);
        Integer angka1 = 20;
        System.out.println("Angka pertama = " + angka1);
        Character kelas = 'A';
        System.out.println("Kelas = " + kelas);
        Float j = 78.0F;
        System.out.println("Nilai dari float = " + j);
        Byte nilai1 = 90;
        System.out.println("Nilai dari Byte adalah = " + nilai1);
        Long nilai2 = 95L;
        System.out.println("Nilai dari Long adalah = " + nilai2);
        Short Nilai3 = 85;
        System.out.println("Nilai dari Short adalah = " + Nilai3);
        Double y = 5.1;
        System.out.println("Nilai dari Double adalah = " + y);
        Boolean data = true;

        System.out.println("---------------------------------");
        //Tipe data reference : BigInteger dan BigDecimal
        BigInteger yu = new BigInteger("987654378");
        System.out.print("Nilai Biginteger adalah = " + yu + "\n");

        BigDecimal wa = new BigDecimal("6789.12345");
        System.out.print("Nilai BigDecimal adalah = " + wa + "\n");

    }

}
