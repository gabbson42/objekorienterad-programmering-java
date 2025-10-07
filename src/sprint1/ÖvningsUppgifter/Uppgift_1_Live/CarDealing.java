package sprint1.ÖvningsUppgifter.Uppgift_1_Live;

import sprint1.Uppgift_1_Live.CarOwner;

public class CarDealing {

    public void sale(sprint1.Uppgift_1_Live.CarOwner seller, CarOwner buyer){
        buyer.setCar(seller.getCar());
        seller.setCar(null);

    }
}
