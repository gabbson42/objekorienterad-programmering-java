package sprint1.ÖvningsUppgifter.Uppgift_3b;

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
