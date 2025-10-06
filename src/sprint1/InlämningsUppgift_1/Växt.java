package sprint1.InlämningsUppgift_1;

/*Implementerar interfacet VattningsProtokoll som innehåller metoden getVätskeMängd.
* Alla subklasser till Växt använder sig av denna metod och ger olika resultat(Polymorphism)*/
public class Växt  implements VattningsProtokoll {

    /*Exempel på inkapsling. Valt att göra variablerna private och
    *istället använda setters och getters där nödvändigt för att komma åt variablerna utifrån klassen.*/
    private String namn;
    private double höjd;
    private VätskeTyp vätskeTyp;

    public Växt(String namn, double höjdIMeter) {
        this.namn = namn;
        this.höjd = höjdIMeter;
    }

    public String getNamn() {
        return namn;
    }

    public double getHöjd() {
        return höjd;
    }

    public VätskeTyp getVätskeTyp() {
        return vätskeTyp;
    }

    public void setVätskeTyp(VätskeTyp vätskeTyp) {
        this.vätskeTyp = vätskeTyp;
    }

    @Override
    public double getVätskeMängd() {
        return 0;
    }
}
