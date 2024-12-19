package RegularExpression.Learing;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*boolean validPhoneNumber = ValidationNumber.isValidPhoneNumber("+998915699980");
        System.out.println(validPhoneNumber);
        boolean validKoreanNumber = ValidationNumber.isValidKoreanNumber("+82101021759119");
        System.out.println(validKoreanNumber);
        boolean validKoreanNumber1 = ValidationNumber.isValidKoreanNumber("+82101421759119");
        System.out.println(validKoreanNumber1);
        boolean validKoreanNumber2 = ValidationNumber.isValidKoreanNumber("+82101821759119");
        System.out.println(validKoreanNumber2);*/

       /* boolean validEmail = ValidationEmail.isValidEmail("xmamatqosimov@gamil.com");
        System.out.println(validEmail);*/

        //firstLevel();
        //intermediateLevel();
        //strictEmailValidation();
        //unicodeSupport();

        //selfCreatedEmailValidation();

        //specificDomainsOnly();

    }

    private static void specificDomainsOnly() {
        String email = "user@example.com";
        String regex = "^[\\w._%+-]+@example\\.com$";
        if (email.matches(regex)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // todo:  "^[\\w._%+-]+@example\\.com$";
    }


    private static void selfCreatedEmailValidation() {
        String email = "xushnidmamtqosimoV.student2@gmail.com";
        String regex = "^[a-zA-z._+-]+[\\w+]+@[\\w+]+\\.[\\p{L}]{2,}$";
        if (email.matches(regex)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static void unicodeSupport() {
        String email = "пример@пример.рф"; // Example in Russian
        String regex = "[\\p{L}\\p{N}._%+-]+@[\\p{L}\\p{N}.-]+\\.[\\p{L}]{2,}$";
        if (email.matches(regex)) {
            System.out.println("Valid email");
        } else {
            System.out.println("not valid email");
        }
        // todo:  "^[\\p{L}\\p{N}._%+-]+@[\\p{L}\\p{N}.-]+\\.[\\p{L}]{2,}$";
    }

    private static void strictEmailValidation() {
        String email = "valid.email@sub.domain.com";
        String regex = "^(?!\\.)[\\w._%+-]+@(?!-)[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(?<!\\.)$";

        if (email.matches(regex)) {
            System.out.println("valid email");
        } else {
            System.out.println("not valid email");
        }
        //  todo: "^(?!\\.)[\\w._%+-]+@(?!-)[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(?<!\\.)$";
    }

    private static void intermediateLevel() {
        String email = "user.name123@sub.domain-example.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        if (email.matches(regex)) {
            System.out.println("Valid email");
        } else {
            System.out.println("Not valid email");
        }
    }

    private static void firstLevel() {
        String example = "exampletest@gmail.com";
        String regex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        boolean matches = pattern.matcher(example).matches();

        if (matches) {
            System.out.println("this is valid email account");
        } else {
            System.out.println("this is not valid email");
        }
    }
}
// todo: "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
// todo: "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
