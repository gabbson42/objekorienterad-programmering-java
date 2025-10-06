package sprint1.Uppgift_1;

public class Bil {

    private String regnummer;
    private String modell;
    private String märke;
    Bilägare ägare;

    public Bil(String märke, String modell, String regnummer) {

        this.märke = märke;
        this.modell = modell;
        this.regnummer = regnummer;
    }

    public void köpaBil(Bilägare nyÄgare) {
        ägare = nyÄgare;
    }

    public void säljaBil() {
        ägare = null;
    }

    public String getRegnummer() {
        return regnummer;
    }

    public String getModell() {
        return modell;
    }

    public String getMärke() {
        return märke;
    }

    public Bilägare getBilägare() {
        return ägare;
    }
}




