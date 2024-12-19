package RegularExpression;

public class SelfCheck {
    public static String valid = "This email is valid";
    public static String invalid = "Not valid email";

    public static void main(String[] args) {
        //basicEmailValidations();
        //intermediateValidations();

        //advancedLevel();


    }

    private static void advancedLevel() {
        String email = "user.name+tag@example.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z.+_-]+[a-z]{2,}$";
        if (email.matches(regex)) {
            System.out.println(valid);
        }else {
            System.out.println(invalid);
        }
    }

    private static void intermediateValidations() {
        String email = "user_name@sub.example.org";
        //String email = "name.lastname@university.net";
        //String email = "john.doe@example.com";
        String regex = "^(?!.*\\.\\.)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-.]+\\.(com|org|net)$";
        if (email.matches(regex)) {
            System.out.println(valid);
        } else {
            System.out.println(invalid);
        }
    }

    private static void basicEmailValidations() {
        //String email = "user_name@domain.co";
        //String email = "john.doe@example.com";
        // String email = ".user@domain.com";
        String email = "user@domain.com";
        String regex = "^[a-zA-z._%+-]+@[a-zA-Z]+.[a-zA-Z]{2,}$";
        if (email.matches(regex)) {
            System.out.println(valid);
        } else {
            System.out.println(invalid);
        }
    }
}

