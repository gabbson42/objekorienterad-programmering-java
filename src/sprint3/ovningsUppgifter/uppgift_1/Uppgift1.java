package sprint3.ovningsUppgifter.uppgift_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Uppgift1 extends JFrame implements ActionListener {

    JPanel jp = new JPanel();
    JPanel southPanel = new JPanel();

    JButton hk = new JButton("Hollow Knight");
    JButton ss = new JButton("Silksong");
    JButton h1 = new JButton("Hades I");
    JButton h2 = new JButton("Hades II");

    JLabel jl = new JLabel(new ImageIcon());

    public Uppgift1(){

        jp.setLayout(new BorderLayout());

        this.add(jp);
        jp.add(jl, BorderLayout.NORTH);
        jp.add(southPanel, BorderLayout.SOUTH);

        southPanel.add(hk);
        southPanel.add(ss);
        southPanel.add(h1);
        southPanel.add(h2);

        hk.addActionListener(this);
        ss.addActionListener(this);
        h1.addActionListener(this);
        h2.addActionListener(this);

        setSize(500, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == hk) {
            jl.setIcon(new ImageIcon("C:/Users/gabri/OneDrive/Bilder/Saved Pictures/hk.jpg"));
        }
        else if (e.getSource() == ss) {
            jl.setIcon(new ImageIcon("C:/Users/gabri/OneDrive/Bilder/Saved Pictures/ss.jpg"));
        }
        else if(e.getSource() == h1) {
            jl.setIcon(new ImageIcon("C:/Users/gabri/OneDrive/Bilder/Saved Pictures/h1.jpg"));
        }
        else if(e.getSource() == h2){
            jl.setIcon(new ImageIcon("C:/Users/gabri/OneDrive/Bilder/Saved Pictures/h2.jpg"));
        }

        jp.revalidate();
        jp.repaint();

    }

    static void main() {
        Uppgift1 run = new Uppgift1();
    }


}
