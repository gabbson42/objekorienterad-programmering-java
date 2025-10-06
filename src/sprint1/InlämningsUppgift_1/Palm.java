package sprint1.InlämningsUppgift_1;

/*Exempel på arv. Palm ärver Växt.*/
public class Palm extends Växt {

    private final double palmDagligVätska = 0.5;

    public Palm(String namn, double höjdIMeter) {
        super(namn, höjdIMeter);
        setVätskeTyp(VätskeTyp.KRANVATTEN);
    }

    @Override
    public double getVätskeMängd() {
        return palmDagligVätska * getHöjd();
    }
}
