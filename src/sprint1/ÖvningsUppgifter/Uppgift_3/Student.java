package sprint1.ÖvningsUppgifter.Uppgift_3;

import sprint1.Uppgift_3.Kurs;
import sprint1.Uppgift_3.Person;

public class Student extends Person {

    private sprint1.Uppgift_3.Kurs[] deltarIKurser;
    private int antalKurser = 0;

    public Student(String namn, int ålder) {
        super(namn, ålder);
        this.deltarIKurser = new sprint1.Uppgift_3.Kurs[5];
    }

    public void deltaIKurs(sprint1.Uppgift_3.Kurs kurs){
        deltarIKurser[antalKurser++] = kurs;
    }

    public Kurs[] getAllaKurser(){
        return deltarIKurser;
    }


}
