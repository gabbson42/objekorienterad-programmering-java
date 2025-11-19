package sprint4.uppgift_5.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    DAO db = new DAO();
    int port = 33333;

    public Server() {

        try (ServerSocket ss = new ServerSocket(port);
             Socket socket = ss.accept();
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)) {

            String question;
            String answer;

            while ((question = br.readLine()) != null){
                answer = db.getKompis(question);

                if (answer == null){
                    pw.println("Person med namnet " + question + " fanns inte i telefonkatalogen.");
                }
                else{
                    pw.println(answer);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() {
        Server server = new Server();
    }
}
