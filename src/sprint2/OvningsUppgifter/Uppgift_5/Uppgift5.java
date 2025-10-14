package sprint2.OvningsUppgifter.Uppgift_5;

import static javax.swing.JOptionPane.*;

import java.util.*;

public class Uppgift5 {

    static void main(String[] arg) {
        try {
            String indata = showInputDialog
                    ("Ange antal dagar, pris per dag samt bilmodell");
            Scanner sc = new Scanner(indata);
            int antalDagar = sc.nextInt();
            double dagsPris = sc.nextDouble();
            String bil = sc.next();
            double totPris = dagsPris * antalDagar;
            String s = String.format("Totalt pris för %s: %.2f",
                    bil, totPris);
            showMessageDialog(null, s);
        }
        catch (InputMismatchException e){
            System.out.println("Felaktig inmatning");
            e.printStackTrace();
        }
        catch (NoSuchElementException e){
            System.out.println("För få parametrar inskrivna");
            e.printStackTrace();
        }
        catch (NullPointerException e){
            System.out.println("Program avbrutet");
        }
    }
}
