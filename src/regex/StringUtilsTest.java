package regex;

public class StringUtilsTest {
    public static void main(String[] args) {
        //testOfPhoneNumber();
        //testOfEmail();
        //testStrongPassword();

        System.out.println(StringUnits.getWords("Hello PDP 12, Welcome to BootCamp"));
    }

    private static void testStrongPassword() {
        System.out.println(StringUnits.isStrongValidPassword("123"));
        System.out.println(StringUnits.isStrongValidPassword("Q123"));
        System.out.println(StringUnits.isStrongValidPassword("Hello23$jk"));
    }

    private static void testOfEmail() {
        System.out.println(StringUnits.isValidEmailAddress("john.asd"));
        System.out.println(StringUnits.isValidEmailAddress("john@.asd"));
        System.out.println(StringUnits.isValidEmailAddress("xmamatqosimov@gmail.com"));
    }

    private static void testOfPhoneNumber() {
        System.out.println(StringUnits.isValidPhoneNumber("+998915699980"));
        System.out.println(StringUnits.isValidPhoneNumber("998915699980"));
        System.out.println(StringUnits.isValidPhoneNumber("+998915699980dfd"));
        System.out.println(StringUnits.isValidPhoneNumber("+998955699980"));
        System.out.println(StringUnits.isValidPhoneNumber("+999955699980"));
    }
}
