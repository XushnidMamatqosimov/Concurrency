package javaThreadPool.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WithThreadLocal {
    // Eng zor va qisqa yoli;
    private static final ThreadLocal<SimpleDateFormat> formatThreadLocal = ThreadLocal.withInitial(SimpleDateFormat::new);

  /*  private static final ThreadLocal<SimpleDateFormat> formatThreadLocal = new ThreadLocal<>() {
        @Override
        public SimpleDateFormat get() {
            return new SimpleDateFormat();
        }
    };*/


    public static void main(String[] args) {
        int coresCount = Runtime.getRuntime().availableProcessors();
        try (ExecutorService service = Executors.newFixedThreadPool(coresCount)) {
            for (int i = 0; i < 1000; i++) {
                a(new Date());
            }
        }
    }

    public static void a(Date date) {
        SimpleDateFormat simpleDateFormat = formatThreadLocal.get();
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(formattedDate);
    }
}
