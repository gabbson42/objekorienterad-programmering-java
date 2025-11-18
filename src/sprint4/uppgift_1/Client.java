package sprint4.uppgift_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    int port = 44444;
    int counter = 0;

    public Client() throws IOException {

        Socket socket = new Socket("127.0.0.1", port);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String temp;

        while((temp = br.readLine()) != null) {
            System.out.println("Quote " + (counter+1) + ": " + temp);
            counter = (counter + 1) % 3;
        }
    }

    static void main() throws IOException {
        Client client = new Client();
    }
}
