package MultiThreading.Task6;

public class Main {
    public static void main(String[] args) {
        var th = new DeamonThread("DEAMON TH");
        var th1 = new DeamonThread("NONDEAMON TH");


        th.setDaemon(true);
        th.start();
        th1.start();
    }
}
