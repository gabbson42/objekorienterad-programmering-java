package sprint1.ÖvningsUppgifter.Uppgift_1;

import sprint1.Uppgift_1.Bil;
import sprint1.Uppgift_1.Bilägare;

public class Main {

    public void printBil(sprint1.Uppgift_1.Bil bil){

        if (bil.getBilägare() == null){
            System.out.println("Bilen " + bil.getMärke() + " " + bil.getModell() +
                    " med registreringsnumret " + bil.getRegnummer() + " är till salu!");
        }
        else{
            System.out.println("Bilen " + bil.getMärke() + " " + bil.getModell() +
                    " med registreringsnumret " + bil.getRegnummer() + " ägs av " + bil.getBilägare());
        }
    }

    Main(){

        Bilägare gabriel = new Bilägare("Gabriel", 31, "Ängsholmsgränd 27");
        Bilägare angelica = new Bilägare("Angelica", 32, "Verkstadsvägen 4B");
        Bilägare rikard = new Bilägare("Rikard", 26, "Mörtgatan 12");

        sprint1.Uppgift_1.Bil toyota = new sprint1.Uppgift_1.Bil("Toyota", "Corolla", "123ABC");
        sprint1.Uppgift_1.Bil ford = new sprint1.Uppgift_1.Bil("Ford", "Mustang", "666LOL");
        sprint1.Uppgift_1.Bil lamborghini = new Bil("Lamborghini", "Gallardo", "313HEJ");

        toyota.köpaBil(gabriel);
        ford.köpaBil(angelica);
        lamborghini.köpaBil(rikard);

        ford.säljaBil();
        lamborghini.säljaBil();
        lamborghini.köpaBil(angelica);

        printBil(toyota);
        printBil(ford);
        printBil(lamborghini);
    }
    public static void main(String[] args) {

        Main run = new Main();

    }
}