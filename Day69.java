package Day10;

public class Hari69 {

    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        int panjang = 20; 
        int lebar = 10;    

        int luas = hitungLuas(panjang, lebar);

        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}
