package Day10;

public class Deklarasi {

    public static void main(String[] args) {
        //Deklarasi 2 variabel
        int var1;
        byte var2;

        //Inisialisasi Variabel
        String var3 = "Yulia";
        short var4 = 14;
        final int var5 = 99;

        //printf digunakan untuk mencetak teks/data dengan format tertentu 
        //mencetak nilai/data yang telah diinisialisasi
        System.out.printf("var3 : %s \n", var3);
        System.out.printf("var4 : %d \n", var4);
        System.out.printf("var5 : %d \n", var5);
        
        System.out.println("-----------------------------------------");
        //update nilai
        var1 = 100;
        var2 = 7;
        var3 = "lala";
        var4 = 16;

        //mencetak nilai yang telah di update menggunakan print format
        System.out.printf("nilai setelah diupdate var3 : %s \n", var3);
        System.out.printf("nilai setelah diupdate var2 : %d \n", var2);
        System.out.printf("nilai setelah diupdate var1 : %d \n", var1);
        System.out.printf("nilai setelah diupdate var4 : %d \n", var4);

    }

}
