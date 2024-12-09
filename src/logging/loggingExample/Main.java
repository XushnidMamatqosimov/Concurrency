package logging.loggingExample;

import java.io.IOException;
import java.util.logging.*;

import static java.lang.System.getProperties;

public class Main {
    static {
        String file = Main.class.getClassLoader().getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", file);

    }

    private static final Logger logger = Logger.getLogger("My Logger");

    public static void main(String[] args) throws IOException {

        LogRecord record = new LogRecord(Level.INFO, "Hello this is simple waring log");
        logger.log(record);


    }
}
