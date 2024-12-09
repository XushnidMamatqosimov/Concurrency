package logging.telegramHandler;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class TelegramAlarmHandler extends StreamHandler {
    @Override
    public void publish(LogRecord record) {
        try {
            String bodyMessage = """
                    {
                    "chat_id":"%s",
                    "text":"%s"
                    }""".formatted(Secrets.chatId, getFormatter().format(record));
            System.out.println(bodyMessage);
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(bodyMessage))
                    .uri(URI.create(Secrets.sendMessage))
                    .build();
            httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }


        // telegra serveriga jontishimiz kk boladi;
        System.out.println(getFormatter().format(record));
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return super.isLoggable(record);
    }
}
