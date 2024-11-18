package Day10;

public class Hari78 {

    public static void main(String[] args) {
        //String method :equalsIgnoreCase

        String input1 = "Hello";
        String input2 = "hello";
        String input3 = "Hai";

        boolean a = input1.equalsIgnoreCase(input2); // true
        boolean b = input1.equalsIgnoreCase(input3); // false

        System.out.println("Apakah '" + input1 + "' sama dengan '" + input2 + "'? " + a);
        System.out.println("Apakah '" + input1 + "' sama dengan '" + input3 + "'? " + b);
    }

}
