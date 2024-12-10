package logging.telegramHandler;

import logging.loggingExample.Main;
import logging.telegramHandler.A.A;

import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.Level;
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
        try {
            if (new Random().nextBoolean()) {
                throw new RuntimeException("Error message for Telegram");
            }else {
                new A().a();
            }
        }catch (RuntimeException e){
            logger.log(Level.SEVERE, "Error message for Telegram ", e);
        }

    }
}

