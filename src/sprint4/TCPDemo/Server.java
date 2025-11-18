package sprint4.TCPDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 33333;

    public Server() throws IOException {

        ServerSocket serverSocket = new ServerSocket(port);

        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String temp;

        while((temp = br.readLine()) != null) {
            System.out.println("message from client: " + temp);
        }
    }

    static void main() throws IOException {

        Server server = new Server();

    }
}
