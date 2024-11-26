package Day10;

public class Hari86 {

    public static void main(String[] args) {
        //Mencetak elemen pada Array satu dimensi
        String hewan[] = {"Kucing", "Ayam", "Sapi", "Kelinci", "Gajah"};
        String bunga[] = {"Mawar", "Melati", "Matahari", "Anggrek", "Tulip"};

        // Mencetak elemen pada array hewan
        System.out.println("Daftar Hewan:");
        for (int i = 0; i < hewan.length; i++) {
            System.out.println("- " + hewan[i]);
        }
        System.out.println();
        // Mencetak elemen pada array bunga
        System.out.println("Daftar Bunga:");
        for (int i = 0; i < bunga.length; i++) {
            System.out.println("- " + bunga[i]);
        }
    }

}
