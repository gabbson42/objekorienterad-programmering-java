package sprint1.ÖvningsUppgifter.Uppgift_1_Live;

import sprint1.Uppgift_1_Live.Car;
import sprint1.Uppgift_1_Live.CarDealing;
import sprint1.Uppgift_1_Live.CarOwner;

public class Testassignment1c {

    public static void main (String[]args){

        sprint1.Uppgift_1_Live.Car c1 = new sprint1.Uppgift_1_Live.Car("ASD123", "Ford", "Röd");
        sprint1.Uppgift_1_Live.Car c2 = new Car("GAB666", "Toyota", "Svart");

        sprint1.Uppgift_1_Live.CarOwner bengt = new sprint1.Uppgift_1_Live.CarOwner("Bengt", 56, "Bengtvägen 3", c1);
        sprint1.Uppgift_1_Live.CarOwner berta = new sprint1.Uppgift_1_Live.CarOwner("Berta", 45, "Bertavägen 6", c2);

        sprint1.Uppgift_1_Live.CarOwner cilla = new CarOwner("Cilla", 45, "Bertavägen 6", null);

        bengt.getData();
        berta.getData();
        cilla.getData();

        sprint1.Uppgift_1_Live.CarDealing cd = new CarDealing();
        cd.sale(bengt, cilla);

        System.out.println();
        bengt.getData();
        berta.getData();
        cilla.getData();
    }
}
