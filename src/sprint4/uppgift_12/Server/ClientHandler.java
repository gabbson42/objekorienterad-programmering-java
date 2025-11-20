package sprint4.uppgift_12.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread{

    private Socket socket;
    private MultiWriter multiWriter;

    public ClientHandler(Socket socket, MultiWriter multiWriter) {
        this.socket = socket;
        this.multiWriter = multiWriter;
    }

    public void run() {

        try(PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))){

            multiWriter.addWriter(out);
            String input;

            while((input = in.readLine()) != null) {
                multiWriter.print(input);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
