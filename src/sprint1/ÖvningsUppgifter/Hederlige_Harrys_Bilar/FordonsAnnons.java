package sprint1.ÖvningsUppgifter.Hederlige_Harrys_Bilar;

public class FordonsAnnons {

    private int pris;
    private String rubrik;
    private String beskrivning;
    private int årsmodell;
    private int antalMil;

    public FordonsAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalMil) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.årsmodell = årsmodell;
        this.antalMil = antalMil;
    }

    public String getAnnonsText(){
        return (rubrik + ", Årsmodell: " + årsmodell + ", " +
                "\nBeskrivning: " + beskrivning + "\nAntal mil: " + antalMil +
                "\nPris: " + pris);
    }
}
