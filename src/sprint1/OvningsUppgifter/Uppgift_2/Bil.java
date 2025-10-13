package sprint1.OvningsUppgifter.Uppgift_2;


public class Bil extends Fordon implements Printable, HjulBuren {

    private int antalVäxlar;
    private int växelJustNu;
    private final int antalHjul = 4;

    public Bil(int hastighet, int vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public boolean växla(int växel){
        if(växel != växelJustNu){
            this.växelJustNu = växel;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void printMe() {
        System.out.println("Bil" + "\nHastighet: " + getHastighet() + " km/h" + "\nVikt: " + getVikt() +
                " kg" + "\nAntal växlar: " + antalVäxlar + "\nVäxel just nu: " + växelJustNu);

    }

    @Override
    public int getAntalHjul() {
        return antalHjul;
    }
}
