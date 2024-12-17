package VaqtlarBilanIshlash.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.*;

public class Main {
    static {
        String file = logging.loggingExample.Main.class.getClassLoader().getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", file);

    }

    private static final Logger logger = Logger.getLogger("My Logger");

    public static void main(String[] args) {

        try {
            LogManager.getLogManager().readConfiguration(
                    LoggingConfig.class.getClassLoader().getResourceAsStream("logging.properties")

            );
            Service service = new Service();
            service.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

        LogRecord record = new LogRecord(Level.INFO, "Hello this is simple warning log");
        logger.log(record);

       /* Service service = new Service();
        service.start();*/
    }
}
