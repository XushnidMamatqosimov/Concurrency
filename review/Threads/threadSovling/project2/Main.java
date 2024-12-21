package Threads.threadSovling.project2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        String[] fileUrls = {
                "https://example.com/file1.txt",
                "https://example.com/file2.txt",
                "https://example.com/file3.txt"
        };

        int i = Thread.activeCount();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (String fileUrl : fileUrls) {
            executorService.submit(new FileDownloadTasks(fileUrl));
        }

        executorService.shutdown();

    }

}

class FileDownloadTasks implements Runnable {
    private final String fileUrl;

    public FileDownloadTasks(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " fileni yuklashni boshladi : " + fileUrl);
        try {
            Thread.sleep(2000);
            System.out.println("----------");
            System.out.println(Thread.currentThread().getName() + " Yuklashni tugatdi : " + fileUrl);
        } catch (InterruptedException e) {
            System.out.println("Yuklashda xatolik " + fileUrl);
        }

    }
}
