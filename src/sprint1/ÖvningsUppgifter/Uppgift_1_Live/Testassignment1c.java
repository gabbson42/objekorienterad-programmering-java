package sprint1.ÖvningsUppgifter.Uppgift_1_Live;

public class Testassignment1c {

    public static void main (String[]args){

        Car c1 = new Car("ASD123", "Ford", "Röd");
        Car c2 = new Car("GAB666", "Toyota", "Svart");

        CarOwner bengt = new CarOwner("Bengt", 56, "Bengtvägen 3", c1);
        CarOwner berta = new CarOwner("Berta", 45, "Bertavägen 6", c2);

        CarOwner cilla = new CarOwner("Cilla", 45, "Bertavägen 6", null);

        bengt.getData();
        berta.getData();
        cilla.getData();

        CarDealing cd = new CarDealing();
        cd.sale(bengt, cilla);

        System.out.println();
        bengt.getData();
        berta.getData();
        cilla.getData();
    }
}
