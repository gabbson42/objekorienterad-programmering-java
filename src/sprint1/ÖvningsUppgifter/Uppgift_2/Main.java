package sprint1.ÖvningsUppgifter.Uppgift_2;

import sprint1.Uppgift_2.*;
import sprint1.Uppgift_2.Bil;
import sprint1.Uppgift_2.Båt;
import sprint1.Uppgift_2.Tåg;

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

        sprint1.Uppgift_2.Bil bil = new sprint1.Uppgift_2.Bil(150, 400, 6, 3);
        bil.växla(5);
        bil.printMe();
        System.out.println();

        sprint1.Uppgift_2.Båt båt = new Båt(20, 200, 100);
        båt.sväng("Babord");
        båt.printMe();
        System.out.println();

        Cykel cykel = new Cykel(30, 15, 3, 1);

        sprint1.Uppgift_2.Tåg tåg = new Tåg(200, 1000, 5);
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
