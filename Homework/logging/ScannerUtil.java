package logging;

import java.util.Scanner;

public class ScannerUtil {
    static Scanner scannerForInt = new Scanner(System.in);
    static Scanner scannerForStr = new Scanner(System.in);

    public static Scanner getScannerForStr(){
        return scannerForStr;
    }

    public static Scanner getScannerForInt (){
        return scannerForInt;
    }

}
