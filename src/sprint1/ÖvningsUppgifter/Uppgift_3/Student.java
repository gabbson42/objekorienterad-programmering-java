package sprint1.ÖvningsUppgifter.Uppgift_3;

public class Student extends Person {

    private Kurs[] deltarIKurser;
    private int antalKurser = 0;

    public Student(String namn, int ålder) {
        super(namn, ålder);
        this.deltarIKurser = new Kurs[5];
    }

    public void deltaIKurs(Kurs kurs){
        deltarIKurser[antalKurser++] = kurs;
    }

    public Kurs[] getAllaKurser(){
        return deltarIKurser;
    }


}
