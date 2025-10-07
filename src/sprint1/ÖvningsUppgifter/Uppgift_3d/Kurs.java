package sprint1.ÖvningsUppgifter.Uppgift_3d;

import sprint1.Uppgift_3d.Lärare;

public class Kurs {

    private String kursNamn;
    private Lärare lärare;

    public Kurs(String kursNamn){
        this.kursNamn = kursNamn;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public String getKursNamn() {
        return kursNamn;
    }

    public void läggTillLärare(Lärare lärare){
        this.lärare = lärare;
    }
}
