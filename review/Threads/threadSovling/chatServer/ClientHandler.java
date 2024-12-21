package Threads.threadSovling.chatServer;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread{
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
}
