package VaqtlarBilanIshlash.legacyapi.simpleDateFormatExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {
    public static void main(String[] args) throws ParseException {
        //format();
        parse();

        //format1();


    }

    private static void format1() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String date = "22/11/2025";
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 40; i++) {
            service.execute(() -> {
                try {
                    System.out.println(format.parse(date));
                } catch (ParseException e) {

                }
            });
        }
        service.shutdown();
    }

    private static void parse() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String date = "22/11/2025";
        Date parse = format.parse(date);
        System.out.println(parse);
    }

    private static void format() {
        Date date = new Date();
        System.out.println(date);
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy 'this is' dd 'day of ' yyyy");
        String formatedDate = simpleDateFormat.format(date);
        System.out.println(formatedDate);
    }
}
