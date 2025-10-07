package sprint1.ÖvningsUppgifter.Uppgift_2;

abstract public class Fordon {

    private int hastighet;
    private int vikt;

    public int getHastighet() {
        return hastighet;
    }

    public int getVikt() {
        return vikt;
    }

    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public void ändraHastighet(int nyHastighet) {
        this.hastighet = nyHastighet;
    }

    abstract public void printMe();
}
