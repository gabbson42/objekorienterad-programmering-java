package sprint1.OvningsUppgifter.Uppgift_3d;

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
