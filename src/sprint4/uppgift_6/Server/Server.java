package sprint4.uppgift_6.Server;

import sprint4.uppgift_6.POJO.Kompis;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    DAO db = new DAO();
    int port = 23456;

    public Server() {

        try (ServerSocket ss = new ServerSocket(port);
             Socket socket = ss.accept();
             ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream())) {

            Object input;
            Object output;

            outputStream.writeObject("Vilken kompis vill du söka upp?");
            outputStream.flush();

            while ((input = inputStream.readObject()) != null) {
                output = db.getKompis((String)input);
                if (output == null) {
                    outputStream.writeObject("Denna kompis finns ej i telefonboken: " + input);
                } else {
                    outputStream.writeObject(output);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() {
        Server server = new Server();
    }
}
