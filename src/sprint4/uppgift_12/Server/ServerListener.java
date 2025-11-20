package sprint4.uppgift_12.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {

    MultiWriter multiWriter = new MultiWriter();
    int portNumber = 12345;

    public ServerListener() {

        try(ServerSocket serverSocket = new ServerSocket(portNumber)){
            while (true) {
                Socket socketToClient = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socketToClient, multiWriter);
                clientHandler.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() {
        ServerListener serverListener = new ServerListener();
    }
}
