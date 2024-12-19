package RegularExpression.Learing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationNumber {
    public static boolean isValidPhoneNumber(String input){
        if (input == null)
            throw new RuntimeException("file not supported");
        Pattern compile = Pattern.compile("^(\\+998)((71|88|9[12349])(\\d{7}))$");
        Matcher matcher = compile.matcher(input);
        return matcher.matches();
    }

    public static  boolean isValidKoreanNumber(String number){
        if (number==null)
            throw new RuntimeException("file not supported");
        Pattern compile = Pattern.compile("^(\\+821)((010|01[456])(\\d{8}))$");
        Matcher matcher = compile.matcher(number);
        return matcher.matches();
    }
}
