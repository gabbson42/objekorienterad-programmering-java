package sprint4.uppgift_2a;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class QuoteReciever {

    static void main() throws IOException {
        int minPort = 55555;
        DatagramSocket socket = new DatagramSocket(minPort);
        byte[] data = new byte[256];
        while(true){
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(message);
        }
    }

}
