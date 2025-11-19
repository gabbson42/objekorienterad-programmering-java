package sprint4.uppgift_5.Client;

import java.io.*;
import java.net.Socket;

public class Client {

    int port = 33333;

    public Client() {

        try (Socket socket = new Socket("127.0.0.1", port);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)) {

            String question;
            String answer;

            while ((question = userInput.readLine()) != null) {
                pw.println(question);

                answer = br.readLine();
                IO.println(answer);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() {
        Client client = new Client();
    }
}
