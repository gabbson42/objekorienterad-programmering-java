package sprint1.ÖvningsUppgifter.Uppgift_2;

public class Tåg extends Fordon implements Printable {

    private int antalVagnar;

    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;

    }
    public boolean kopplaVagn(int antal){
        if(antal + antalVagnar == antalVagnar) {
            return false;
        }else{
            this.antalVagnar += antal;
            return true;
        }
    }

    @Override
    public void printMe() {
        System.out.println("Tåg" + "\nHastighet: " + getHastighet() + " km/h" +
                "\nVikt: " + getVikt() + " kg" + "\nAntal vagnar: " +  antalVagnar);
    }
}
