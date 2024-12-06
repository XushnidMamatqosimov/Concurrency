package regex.Task1;

import javax.security.auth.callback.CallbackHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {
    public static List<String> getInteger(String input) {
        if (input == null) {
            throw new RuntimeException("Invalid Operation");
        }
        Pattern compile = Pattern.compile("(?=.*\\w+)(?=.*\\d+)(?=.*\\W)");
        Matcher matcher = compile.matcher(input);

        List<String> integerList = new ArrayList<>();
        // Pattern compile1 = Pattern.compile("([1234567890])");
        // char[] chars = new char[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //int number = 1;
        int counter = 0;
       /* boolean containsDigit = false;
        while (matcher.find()) {
            for (char ch : input.toCharArray()) {
                if (Character.isDigit(ch)) {
                    containsDigit = true;
                    integerList.add(String.valueOf(ch));
                }
            }
        }*/

        long b = input.chars().filter(Character::isDigit).count();
        System.out.println("count  ___" + b);
        return integerList;
    }

    // todo: better version of GetNumberFrom String;
    public static int getNumberCount(String input) {
        Pattern compile = Pattern.compile("\\d");
        Matcher matcher = compile.matcher(input);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public static void digitCounter(String input) {
        long count = input.chars().filter(Character::isDigit).count();
        System.out.println("Number of digits in this string: " + count);
    }

    public static void bestOne(String input) {
        int digitCount = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        System.out.println("Digits count in this Text : " + digitCount);
    }



}
