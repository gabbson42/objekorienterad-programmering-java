package sprint1.Uppgift_1_Live;

public class Car {

    private String regNr;
    private String brand;
    private String color;

    public Car(String regNr, String brand, String color){
        this.regNr = regNr;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString(){
        return regNr + " " + brand + " " + color;
    }
}
