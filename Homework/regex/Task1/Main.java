package regex.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
       /* System.out.println(Service.getInteger("salom mening ismim Xushnid men 19 yoshdaman va 20 ga tolaman;"));
        System.out.println(Service.getNumberCount("hello guys we have a presentation on 2th of the December and are you ready for that" +
                "if you are not please contact me today till 12:35 "));
        Service.digitCounter("In this fall semester we accepted over 950 students and 45 of them are Uzbeks");
        Service.bestOne("In doing so last 4 years we noticed about 25% of increase in our GDP");*/

        method("salom bugun 2 dekabr 2024 yil");
        String text = "2 Dekabr 2024 yil";
        long number = text.chars().filter(Character::isDigit).count();
        System.out.println(number);


        System.out.println("Hello for git");




    }

    public static void method (String str){
        int counter = 0;
       /* for (char ch : str.toCharArray()) {
          str.chars().filter(Character.isDigit(Integer.parseInt(str)))
        }*/

    }

}
