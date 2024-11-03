package Day10;

public class Hari63 {

    public static void main(String[] args) {
        //Keyword : Continue
        int i = 1;
        while (true) {
            if (i == 3) {
                i++;  
                continue;
            }
            System.out.println("Nilai i: " + i);
            i++;

            if (i > 5) {
                break;
            }
        }
    }

}
