package logging.telegramHandler;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class TelegramAlarmHandler extends StreamHandler {
    public TelegramAlarmHandler() {
        super.setFilter(new TelegramAlarmFilter());
        super.setFormatter(new TelegramAlarmFormatter());
    }

    @Override
    public void publish(LogRecord record) {
        if (isLoggable(record)) {
            try {
                String formattedMessage = getFormatter().format(record);
                String bodyMessage = """
                        {
                        "chat_id":"%s",
                        "text":"%s"
                        }""".formatted(Secrets.chatId, formattedMessage);

                HttpClient httpClient = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .POST(HttpRequest.BodyPublishers.ofString(bodyMessage))
                        .uri(URI.create(Secrets.sendMessage))
                        .header("Content-Type", "application/json")
                        .build();
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        // telegra serveriga jontishimiz kk boladi;
        System.out.println(getFormatter().format(record));
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return getFilter().isLoggable(record);
    }
}
