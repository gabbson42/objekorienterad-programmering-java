package sprint3.ovningsUppgifter.uppgift_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Uppgift3 extends JFrame implements ActionListener {

    JPanel base = new JPanel(new BorderLayout());
    JPanel northPanel = new JPanel(new GridLayout(2,2));
    JPanel centerPanel = new JPanel(new GridLayout(2,5));
    JPanel southPanel = new JPanel(new GridLayout(2,6));

    JLabel prisLabel = new JLabel("Pris på vara:");
    JLabel betalaLabel = new JLabel("Hur mycket betalas:");
    JTextField prisTextField = new JTextField();
    JTextField betalaTextField = new JTextField();

    JCheckBox tusenLapp = new JCheckBox("1000-lapp");
    JCheckBox röding = new JCheckBox("500-lapp");
    JCheckBox tvåhundraLapp = new JCheckBox("200-lapp");
    JCheckBox hundraLapp = new JCheckBox("100-lapp");
    JCheckBox femtioLapp = new JCheckBox("50-lapp");
    JCheckBox tjugoLapp = new JCheckBox("20-lapp");
    JCheckBox tioKrona = new JCheckBox("10-krona");
    JCheckBox femKrona = new JCheckBox("5-krona");
    JCheckBox tvåKrona = new JCheckBox("2-krona");
    JCheckBox enKrona = new JCheckBox("1-krona");

    JLabel result = new JLabel("");
    JLabel tusenResult = new JLabel("");
    JLabel rödingResult = new JLabel("");
    JLabel tvåhundraResult = new JLabel("");
    JLabel hundraResult = new JLabel("");
    JLabel femtioResult = new JLabel("");
    JLabel tjugoResult = new JLabel("");
    JLabel tioResult = new JLabel("");
    JLabel femResult = new JLabel("");
    JLabel tvåResult = new JLabel("");
    JLabel enResult = new JLabel("");

    JButton räkna = new JButton("Räkna ut");


    public Uppgift3(){

        this.add(base);
        base.add(northPanel, BorderLayout.NORTH);
        base.add(centerPanel, BorderLayout.CENTER);
        base.add(southPanel, BorderLayout.SOUTH);

        northPanel.add(prisLabel);
        northPanel.add(betalaLabel);
        northPanel.add(prisTextField);
        northPanel.add(betalaTextField);

        prisTextField.addActionListener(this);
        betalaTextField.addActionListener(this);

        centerPanel.add(tusenLapp);
        centerPanel.add(röding);
        centerPanel.add(tvåhundraLapp);
        centerPanel.add(hundraLapp);
        centerPanel.add(femtioLapp);
        centerPanel.add(tjugoLapp);
        centerPanel.add(tioKrona);
        centerPanel.add(femKrona);
        centerPanel.add(tvåKrona);
        centerPanel.add(enKrona);

        tusenLapp.addActionListener(this);
        röding.addActionListener(this);
        tvåhundraLapp.addActionListener(this);
        hundraLapp.addActionListener(this);
        femtioLapp.addActionListener(this);
        tjugoLapp.addActionListener(this);
        tioKrona.addActionListener(this);
        femKrona.addActionListener(this);
        tvåKrona.addActionListener(this);
        enKrona.addActionListener(this);

        southPanel.add(result);
        southPanel.add(tusenResult);
        southPanel.add(rödingResult);
        southPanel.add(tvåhundraResult);
        southPanel.add(hundraResult);
        southPanel.add(femtioResult);
        southPanel.add(tjugoResult);
        southPanel.add(tioResult);
        southPanel.add(femResult);
        southPanel.add(tvåResult);
        southPanel.add(enResult);
        southPanel.add(räkna);

        räkna.addActionListener(this);

        setSize(700,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String prisText = prisTextField.getText();
        String betalaText = betalaTextField.getText();
        int prisInt = Integer.parseInt(prisText);
        int betalaInt = Integer.parseInt(betalaText);
        int växel = betalaInt - prisInt;
        int tempVäxel = växel;

        int tusenLappCounter = 0; int rödingCounter = 0; int tvåhundraLappCounter = 0;
        int hundraLappCounter = 0; int femtioLappCounter = 0; int tjugoLappCounter = 0;
        int tioKronaCounter = 0; int femKronaCounter = 0; int tvåKronaCounter = 0; int enKronaCounter = 0;

        if(tusenLapp.isSelected()){
            tusenLappCounter = tempVäxel / 1000;
            tempVäxel = tempVäxel - (tusenLappCounter * 1000);
        }
        if(röding.isSelected()){
            rödingCounter = tempVäxel / 500;
            tempVäxel = tempVäxel - (rödingCounter * 500);
        }
        if(tvåhundraLapp.isSelected()){
            tvåhundraLappCounter = tempVäxel / 200;
            tempVäxel = tempVäxel - (tvåhundraLappCounter * 200);
        }
        if(hundraLapp.isSelected()){
            hundraLappCounter = tempVäxel / 100;
            tempVäxel = tempVäxel - (hundraLappCounter * 100);
        }
        if(femtioLapp.isSelected()){
            femtioLappCounter = tempVäxel / 50;
            tempVäxel = tempVäxel - (femtioLappCounter * 50);
        }
        if(tjugoLapp.isSelected()){
            tjugoLappCounter = tempVäxel / 20;
            tempVäxel = tempVäxel - (tjugoLappCounter * 20);
        }
        if(tioKrona.isSelected()){
            tioKronaCounter = tempVäxel / 10;
            tempVäxel = tempVäxel - (tioKronaCounter * 10);
        }
        if(femKrona.isSelected()){
            femKronaCounter = tempVäxel / 5;
            tempVäxel = tempVäxel - (femKronaCounter * 5);
        }
        if(tvåKrona.isSelected()){
            femKronaCounter = tempVäxel / 2;
            tempVäxel = tempVäxel - (tvåKronaCounter * 2);
        }
        if(enKrona.isSelected()){
            enKronaCounter = tempVäxel;
        }

        result.setText("Total växel: " + växel);
        tusenResult.setText("Antal 1000-lappar: " + tusenLappCounter);
        rödingResult.setText("Antal 500-lappar: " + rödingCounter);
        tvåhundraResult.setText("Antal 200-lappar: " + tvåhundraLappCounter);
        hundraResult.setText("Antal 100-lappar: " + hundraLappCounter);
        femtioResult.setText("Antal 50-lappar: " + femtioLappCounter);
        tjugoResult.setText("Antal 20-lappar: " + tjugoLappCounter);
        tioResult.setText("Antal 10-kronor: " + tioKronaCounter);
        femResult.setText("Antal 5-kronor: " + femKronaCounter);
        tvåResult.setText("Antal 2-kronor: " + tvåKronaCounter);
        enResult.setText("Antal 1-kronor: " + enKronaCounter);

        if(e.getSource() == räkna) {
            base.revalidate();
            base.repaint();
        }
    }

    static void main() {
        Uppgift3 run = new Uppgift3();
    }
}
