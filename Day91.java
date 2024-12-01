package Day10;

import java.util.*;
import java.util.regex.*;

public class Hari91 {
    public static void main(String[] args) {
        Scanner yulia = new Scanner(System.in);
        
        int n = Integer.parseInt(yulia.nextLine());

        List<String> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String sentence = yulia.nextLine();
            results.add(removeDuplicateWords(sentence)); 
        }

        yulia.close();

        for (String result : results) {
            System.out.println("Hasil : "+ result);
        }
    }

    public static String removeDuplicateWords(String sentence) {
        String regex = "\\b(\\w+)\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); 
        Set<String> seenWords = new HashSet<>(); 

        Matcher matcher = pattern.matcher(sentence);

        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            String word = matcher.group(1).toLowerCase(); 

            if (seenWords.add(word)) { 
                if (result.length() > 0) { 
                    result.append(" ");
                }
                result.append(matcher.group(1)); 
            }
        }

        return result.toString();
    }
}
