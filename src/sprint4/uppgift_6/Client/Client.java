package sprint4.uppgift_6.Client;

import sprint4.uppgift_6.POJO.Kompis;

import java.io.*;
import java.net.Socket;

public class Client {

    int port = 23456;

    public Client() {

        try (Socket socket = new Socket("127.0.0.1", port);
             ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream())) {

            String question;
            Object answer;
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            while ((answer = inputStream.readObject()) != null) {

                IO.println("Server: " + answer);

                question = userInput.readLine();
                if(question != null) {
                    IO.println("Client: " + question);
                    outputStream.writeObject(question);
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() {
        Client client = new Client();
    }
}
