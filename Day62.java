package Day10;

public class Hari62 {

    public static void main(String[] args) {
        //Keyword : break
        int a = 1;
        while (true) {
            System.out.println("Iterasi ke- " + a + " masih berjalan");
            a++;

            if (a >= 20) {
                System.out.println("Loop berhenti karena nilai a sudah mencapai " + a);
                break;
            }
        }

    }

}
