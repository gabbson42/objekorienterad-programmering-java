package sprint4.uppgift_2a;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class QuoteSender {


    final static String qoute1 = "Dreams and deception is a powerful combination";
    final static String quote2 = "Whatever your're thinking, think bigger.";
    final static String quote3 = "Maybe swearing will help?";
    final static String quote4 = "To be, or not to be..";
    final static String quote5 = "Good news everyone!";


    static void main() throws IOException, InterruptedException {
        List<String> quotes = new ArrayList<>();
        quotes.add(qoute1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);
        quotes.add(quote5);
        int listCounter = 0;

        InetAddress toAdr = InetAddress.getLocalHost();
        int toPort = 55555;
        DatagramSocket socket = new DatagramSocket();
        while(true){
            byte[] data = quotes.get(listCounter).getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, toAdr, toPort);
            socket.send(packet);
            listCounter = (listCounter + 1) % 5;
            Thread.sleep(3000);
        }
    }
}
