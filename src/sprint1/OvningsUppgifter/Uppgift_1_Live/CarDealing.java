package sprint1.OvningsUppgifter.Uppgift_1_Live;

public class CarDealing {

    public void sale(CarOwner seller, CarOwner buyer){
        buyer.setCar(seller.getCar());
        seller.setCar(null);

    }
}
