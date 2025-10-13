package sprint1.OvningsUppgifter.Uppgift_1_Live;

public class CarOwner extends Person {

    private Car car;

    public CarOwner(String name, int age, String address, Car car) {
        super(name, age, address);
        this.car = car;
    }

    public Car getCar() {
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
