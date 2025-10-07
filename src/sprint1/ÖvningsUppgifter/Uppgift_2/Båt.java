package sprint1.ÖvningsUppgifter.Uppgift_2;

import sprint1.Uppgift_2.Fordon;
import sprint1.Uppgift_2.Printable;

public class Båt extends Fordon implements Printable {

    private int dödvikt;

    public Båt(int hastighet, int vikt, int dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }

    public void sväng(String riktning){
        System.out.println("Båten svänger " + riktning);
    }

    @Override
    public void printMe() {
        System.out.println("Båt" + "\nHastighet: " + getHastighet() + " km/h" +
                "\nVikt: " + getVikt() + " kg" + "\nDödvikt: : " + dödvikt);
    }
}
