package sprint1.ÖvningsUppgifter.Uppgift_3b;

import sprint1.Uppgift_3b.Kurs;
import sprint1.Uppgift_3b.Person;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<sprint1.Uppgift_3b.Kurs> deltarIKurser;

    public Student(String namn, int ålder) {
        super(namn, ålder);
        deltarIKurser = new ArrayList<>();
    }

    public void deltaIKurs(sprint1.Uppgift_3b.Kurs kurs) {
        deltarIKurser.add(kurs);
    }

    public ArrayList<Kurs> getAllaKurser() {
        return deltarIKurser;
    }
}
