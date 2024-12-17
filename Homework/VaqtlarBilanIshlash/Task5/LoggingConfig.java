package VaqtlarBilanIshlash.Task5;
import java.util.logging.LogManager;

public class LoggingConfig {
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(
                    LoggingConfig.class.getClassLoader().getResourceAsStream("logging.properties")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
