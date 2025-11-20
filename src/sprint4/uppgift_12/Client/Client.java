package sprint4.uppgift_12.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends JFrame implements ActionListener {

    JTextArea txt = new JTextArea();
    JScrollPane sp = new JScrollPane(txt);
    JTextField skriv = new JTextField();
    private BufferedReader in;
    private PrintWriter out;
    String name = "";

    public Client() {

        name = JOptionPane.showInputDialog(null, "Ange ditt chatt-alias");
        setTitle("Chat "+name);
        txt.setEditable(false);
        add(sp, BorderLayout.CENTER);
        add(skriv, BorderLayout.SOUTH);
        skriv.addActionListener(this);
        setSize(400, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String hostName = "127.0.0.1";
        int portNumber = 12345;

        try(Socket socket = new Socket(hostName, portNumber)){

            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String fromServer;

            while((fromServer = in.readLine()) != null) {
                txt.append(fromServer + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            out.println(name + ": " + skriv.getText());
            skriv.setText("");
        }catch (Exception e1){
            throw new RuntimeException(e1);
        }
    }

    static void main() {
        Client client = new Client();
    }
}
