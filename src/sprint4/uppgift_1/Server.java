package sprint4.uppgift_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    final static String quote1 = "Good news everyone!";
    final static String quote2 = "Shut up and take my money!";
    final static String quote3 = "I don't want to live on this planet any longer";
    int port = 44444;
    int listCounter = 0;

    public Server() throws IOException, InterruptedException {
        List<String> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        ServerSocket serverSocket = new ServerSocket(port);

        Socket socket = serverSocket.accept();
        PrintWriter out = new PrintWriter( socket.getOutputStream(), true);

        while(true) {
            String temp = quotes.get(listCounter);
            out.println(temp);
            System.out.println("Sent quote " + (listCounter+1) + ": " + temp);
            listCounter = (listCounter + 1) % 3;
            Thread.sleep(2000);
        }
    }

    static void main() throws IOException, InterruptedException {
        Server server = new Server();
    }
}
