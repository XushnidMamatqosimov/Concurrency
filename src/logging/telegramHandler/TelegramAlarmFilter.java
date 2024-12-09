package logging.telegramHandler;

import java.io.File;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class TelegramAlarmFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
