package logging.telegramHandler;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class TelegramAlarmFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        String stackTrace = "\n";
        Throwable thrown = record.getThrown();
        if (thrown != null) {
            StringWriter out = new StringWriter();
            PrintWriter printWriter = new PrintWriter(out);
            thrown.printStackTrace(printWriter);
            stackTrace+=out.toString();

        }
        return  "%s :: [%d] :: %s :: [%s] %s ".
                formatted(record.getLevel(),
                        record.getLongThreadID(),
                        record.getLoggerName(),
                        record.getMessage(),
                stackTrace);
        /*Throwable thrown = record.getThrown();
        if (thrown != null) {
            message = message +"\n"+thrown.getStackTrace();
            */

    }
}
