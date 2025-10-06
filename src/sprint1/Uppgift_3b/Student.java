package sprint1.Uppgift_3b;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<Kurs> deltarIKurser;

    public Student(String namn, int ålder) {
        super(namn, ålder);
        deltarIKurser = new ArrayList<>();
    }

    public void deltaIKurs(Kurs kurs) {
        deltarIKurser.add(kurs);
    }

    public ArrayList<Kurs> getAllaKurser() {
        return deltarIKurser;
    }
}
