package sprint1.OvningsUppgifter.Uppgift_3b;

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
