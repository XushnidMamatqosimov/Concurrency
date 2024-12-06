package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("e.{2}");
        Matcher matcher = pattern.matcher("Hello Xushnid aka qandaysiz, ishlariz 5 mi? 45mi. etta getta");
        System.out.println(matcher.matches());
        while (matcher.find()) {
            System.out.println("start="+matcher.start()+", end="+matcher.end()+", group="+matcher.group());
        }
    }
}
