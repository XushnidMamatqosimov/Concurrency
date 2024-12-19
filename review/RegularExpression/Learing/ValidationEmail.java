package RegularExpression.Learing;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {
    public static boolean isValidEmail(String string) {
        if (Objects.isNull(string))
            throw new RuntimeException("file not supported");
        Pattern compile = Pattern.compile("^(\\w+)@([\\w-]+)\\.(\\w{2,4})$");
        Matcher matcher = compile.matcher(string);
        return matcher.matches();
    }
}

//todo; ("(\\w+)@([\\w-]+)\\.(\\w{2,4})");
