package sprint1.Uppgift_3;

abstract public class Person {

    private String namn;
    private int ålder;

    public Person(String namn, int ålder){
        this.namn = namn;
        this.ålder = ålder;

    }

    public String getNamn() {
        return namn;
    }
}
