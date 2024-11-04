package Day10;

public class Hari64 {

    public static void main(String[] args) {

        //break label
        yulia:
        for (int i = 1; i < 3; i++) { 
            for (int j = 1; j < 3; j++) { 
                if (i != 1 && j != 1) {  
                    break yulia;
                }
                System.out.println("i: " + i + ", j: " + j); 
            }
        }
        System.out.println("Loop selesai"); 
    }

}
