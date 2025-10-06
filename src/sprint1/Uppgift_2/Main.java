package sprint1.Uppgift_2;

public class Main {

    public void printFordon(Fordon fordon){
        fordon.printMe();
    }

    public void printViaInterface(Printable anyFordon){
        anyFordon.printMe();
    }

    public void printAntalHjul(HjulBuren hjulBuren){
        System.out.println("Antal hjul: "+ hjulBuren.getAntalHjul());
    }

    public Main() {

        Bil bil = new Bil(150, 400, 6, 3);
        bil.växla(5);
        bil.printMe();
        System.out.println();

        Båt båt = new Båt(20, 200, 100);
        båt.sväng("Babord");
        båt.printMe();
        System.out.println();

        Cykel cykel = new Cykel(30, 15, 3, 1);

        Tåg tåg = new Tåg(200, 1000, 5);
        tåg.kopplaVagn(3);
        tåg.printMe();
        tåg.kopplaVagn(-2);
        tåg.printMe();
        System.out.println();

        printViaInterface(bil);
        System.out.println();
        printFordon(cykel);

        HjulBuren bil2 = new Bil(100,  400, 6, 2);
        HjulBuren cykel2 = new Cykel(30, 15, 5, 3);

        printAntalHjul(bil2);
        printAntalHjul(cykel2);
        printAntalHjul(bil);

    }
    public static void main(String[] args) {
        Main run = new Main();
    }
}
