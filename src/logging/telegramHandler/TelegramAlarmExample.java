package logging.telegramHandler;

import logging.loggingExample.Main;

import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class TelegramAlarmExample {

    static {
        String file = TelegramAlarmExample.class.getClassLoader().getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", file);

    }
    private static Logger logger = Logger.getLogger(TelegramAlarmExample.class.getSimpleName());

    public static void main(String[] args) {
        Handler handler = new TelegramAlarmHandler();
        logger.addHandler(handler);
        if (new Random().nextBoolean()){
            logger.severe("Error message for Telegram");
        } else {
            logger.info("INfo message for console, file handlers");
        }

    }
}

