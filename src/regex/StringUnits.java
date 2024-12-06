package regex;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUnits {

    public static final Pattern VALID_EMAIL_PATTERN = Pattern.compile("(\\w+)@([\\w-]+)\\.(\\w{2,4})");
    public static final Pattern VALID_PHONE_NUMBER = Pattern.compile("^(\\+998)((71|88|9[01349])(\\d{7}))$");
    public static final Pattern PASSWORD_VALIDATIION = Pattern.compile("^(?=.*[a-z]+)(?=.*[A-Z]+)(?=.*\\d+)(?=.*[!@#$&*>]+).{8,32}$");

    public static boolean isValidPhoneNumber(String input) {
        if (input == null) {
            throw new RuntimeException("Number can not be null");
        }
        Matcher matcher = VALID_PHONE_NUMBER.matcher(input);
        return matcher.matches();
    }

    public static boolean isValidEmailAddress(String input) {
        if (input == null) {
            throw new RuntimeException("Email can not be null;");
        }
        return VALID_EMAIL_PATTERN.matcher(input).matches();
    }

    public static boolean isStrongValidPassword(String input) {
        if (input == null)
            throw new RuntimeException("Password is invalid");
        return PASSWORD_VALIDATIION.matcher(input).matches();
    }

    public static List<String> getWords(String input) {
        if (input == null)
            throw new RuntimeException("not valid characters");
        Pattern compile = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = compile.matcher(input);

        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }


}
