package InlämningsUppgifter.InlämningsUppgift_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Greenest {

    public Greenest() {

        /*Exempel på dynamisk bindning. Tillkallar klassen Växt men skapar upp objekt av olika växttyper*/
        Växt igge = new Kaktus("Igge", 0.2);
        Växt laura = new Palm("Laura", 5);
        Växt meatLoaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Växt olof = new Palm("Olof", 1);

        List<Växt> allaVäxter = new ArrayList<>();
        Collections.addAll(allaVäxter, igge, laura, meatLoaf, olof);

        try {
            String växt = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            boolean växtHittad = false;

            for (Växt v : allaVäxter) {
                if (växt.equalsIgnoreCase(v.getNamn())) {
                    växtHittad = true;

                    JOptionPane.showMessageDialog(null, v.getNamn() +
                            " ska få " + v.getVätskeMängd() + " liter " +
                            v.getVätskeTyp().toString().toLowerCase());
                }
            }

            if (!växtHittad) {
                JOptionPane.showMessageDialog(null, "Växten kunde ej hittas");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Program avbrutet");
        }
    }

    public static void main(String[] args) {

        Greenest run = new Greenest();

    }
}
