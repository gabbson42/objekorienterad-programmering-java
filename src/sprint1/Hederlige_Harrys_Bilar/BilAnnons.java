package sprint1.Hederlige_Harrys_Bilar;

public class BilAnnons extends FordonsAnnons{

    private String färg;
    private boolean sommardäck;
    private boolean vinterdäck;

    public BilAnnons(int pris, String rubrik, String beskrivning, int årsmodell, String färg, int antalMil,
                     boolean sommardäck, boolean vinterdäck) {
        super(pris, rubrik, beskrivning, årsmodell, antalMil);
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
    }
}
