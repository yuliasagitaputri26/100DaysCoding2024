package Day10;

public class Deklarasi {

    public static void main(String[] args) {
        //Deklarasi 2 variabel  yaitu var1 dan var2 tanpa inisialisasi 
        int var1;
        byte var2;

        //Inisialisasi Variabel
        String var3 = "Yulia";//inisialisasi variabel var3 dengan tipe data String
        short var4 = 14;//inisialisasi variabel var4 dengan tipe data short
        final int var5 = 99;//inisialisasi variabel var5 dengan tipe data int

        //printf digunakan untuk mencetak teks/data dengan format tertentu 
        //mencetak nilai/data yang telah diinisialisasi
        System.out.printf("var3 : %s \n", var3);//%s untuk String, dan \n untuk baris baru
        System.out.printf("var4 : %d \n", var4);//%d untuk tipe data bilangan bulat, dan \n untuk baris baru
        System.out.printf("var5 : %d \n", var5);//%s untuk tipe data bilangan bulat, dan \n untuk baris baru
        
        System.out.println("-----------------------------------------");
        //update nilai
        var1 = 100;//mengubah nilai
        var2 = 7;//mengubah nilai
        var3 = "lala";//mengubah nilai
        var4 = 16;//mengubah nilai

        //mencetak nilai yang telah di update menggunakan print format
        System.out.printf("nilai setelah diupdate var3 : %s \n", var3);//mencetak nilai/data yang telah di update
        System.out.printf("nilai setelah diupdate var2 : %d \n", var2);//mencetak nilai/data yang telah di update
        System.out.printf("nilai setelah diupdate var1 : %d \n", var1);//mencetak nilai/data yang telah di update
        System.out.printf("nilai setelah diupdate var4 : %d \n", var4);//mencetak nilai/data yang telah di update

    }

}
