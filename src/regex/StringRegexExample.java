package regex;

import java.util.Arrays;

public class StringRegexExample {
    public static void main(String[] args) {
        String input = "Some 12 random 3 Text 90 For fun 88 or 321";
        String[] split = input.split("\\d+");
        System.out.println(Arrays.toString(split));

        String input1 = "hello 12 how are 45 bolayabdi 7";
        boolean matches = input1.matches("\\d{4,}");
        System.out.println(matches);
        String string = input1.replaceAll("\\d+", "Hello PDP");
        System.out.println(string);

    }
}
