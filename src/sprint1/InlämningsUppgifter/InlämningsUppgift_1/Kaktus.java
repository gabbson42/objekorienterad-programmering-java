package sprint1.InlämningsUppgifter.InlämningsUppgift_1;

/*Exempel på arv. Kaktus ärver Växt.*/
public class Kaktus extends Växt {

    private final double kaktusDagligVätska = 0.02;

    public Kaktus(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        setVätskeTyp(VätskeTyp.MINERALVATTEN);
    }

    @Override
    public double getVätskeMängd() {
        return kaktusDagligVätska;
    }
}
