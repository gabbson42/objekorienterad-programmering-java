package sprint3.ovningsUppgifter.uppgift_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Uppgift2 extends JFrame implements ActionListener {

    JPanel jp = new JPanel(new BorderLayout());
    JPanel southPanel = new JPanel(new GridLayout(1,3));
    JPanel westPanel = new JPanel(new GridLayout(3,1));
    JPanel eastPanel = new JPanel(new GridLayout(3,1));

    JLabel mätarStällningNu = new JLabel("Ange mätarställning nu:");
    JLabel mätarStällningFörr = new JLabel("Ange mätarställning för ett år sedan:");
    JLabel literFörbrukadBensin = new JLabel("Ange liter förbrukad bensin:");

    JTextField tf1 = new JTextField(30);
    JTextField tf2 = new JTextField(30);
    JTextField tf3 = new JTextField(30);

    JLabel antalKördaMil = new JLabel();
    JLabel antalLiterBensin = new JLabel();
    JLabel förbrukningPerMil = new JLabel();


    public Uppgift2(){

        this.add(jp);
        jp.add(southPanel, BorderLayout.SOUTH);
        jp.add(westPanel, BorderLayout.WEST);
        jp.add(eastPanel, BorderLayout.EAST);

        westPanel.add(mätarStällningNu);
        westPanel.add(mätarStällningFörr);
        westPanel.add(literFörbrukadBensin);

        eastPanel.add(tf1);
        eastPanel.add(tf2);
        eastPanel.add(tf3);

        tf1.addActionListener(this);
        tf2.addActionListener(this);
        tf3.addActionListener(this);

        southPanel.add(antalKördaMil);
        southPanel.add(antalLiterBensin);
        southPanel.add(förbrukningPerMil);



        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tf1Text = tf1.getText();
        String tf2Text = tf2.getText();
        String tf3Text = tf3.getText();

        double tf1Double = Double.parseDouble(tf1Text);
        double tf2Double = Double.parseDouble(tf2Text);
        double tf3Double = Double.parseDouble(tf3Text);

        antalKördaMil.setText("Antal körda mil: " + (tf1Double - tf2Double));
        antalLiterBensin.setText("Antal liter bensin: " + tf3Double);
        förbrukningPerMil.setText("Förbrukning per mil: " + (tf3Double / (tf1Double - tf2Double)));

    }

    static void main() {
        Uppgift2 run = new Uppgift2();
    }

}
