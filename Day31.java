package Day10;

public class Hari31 {

    public static void main(String[] args) {
        //Konversi String ke tipedata long
        String a = "80";
        long nilai = Long.parseLong(a);
        System.out.println("String ke long: " + nilai);

        //Konversi String ke tipedata float
        String b = "60.5f";
        float nilai1 = Float.parseFloat(b);
        System.out.println("String ke float: " + nilai1);

        //Konversi String ke tipedata double
        String c = "50.0";
        double nilai2 = Double.parseDouble(c);
        System.out.println("String ke double: " + nilai2);
    }

}
