package sprint1.ÖvningsUppgifter.Uppgift_1_Live;

import sprint1.Uppgift_1_Live.Car;
import sprint1.Uppgift_1_Live.Person;

public class CarOwner extends Person {

    private sprint1.Uppgift_1_Live.Car car;

    public CarOwner(String name, int age, String address, sprint1.Uppgift_1_Live.Car car) {
        super(name, age, address);
        this.car = car;
    }

    public sprint1.Uppgift_1_Live.Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void getData(){
        if (car != null){
            System.out.println(car + " ägs av " + getName());
        }else{
            System.out.println(getName() + " har ingen bil");
        }
    }
}
