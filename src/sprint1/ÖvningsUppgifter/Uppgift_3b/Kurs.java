package sprint1.ÖvningsUppgifter.Uppgift_3b;

import sprint1.Uppgift_3b.Lärare;
import sprint1.Uppgift_3b.Student;

import java.util.ArrayList;

public class Kurs {

    private String kursNamn;
    private Lärare lärare;
    protected ArrayList<Student> studenter;

    public Kurs(String kursNamn){
        this.kursNamn = kursNamn;
        studenter = new ArrayList<>();
    }

    public ArrayList<Student> getStudenter() {
        return studenter;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public String getKursNamn() {
        return kursNamn;
    }

    public void läggTillStudent(Student student){
        studenter.add(student);
    }

    public void läggTillLärare(Lärare lärare){
        this.lärare = lärare;
    }
}
