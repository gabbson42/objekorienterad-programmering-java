package sprint1.ÖvningsUppgifter.Uppgift_3;

import sprint1.Uppgift_3.Lärare;
import sprint1.Uppgift_3.Student;

public class Kurs {

    private String kursNamn;
    private Lärare lärare;
    private Student[] studenter;
    private int antalStudenter;

    public Kurs(String kursNamn){
        this.kursNamn = kursNamn;
        studenter = new Student[10];
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public String getKursNamn() {
        return kursNamn;
    }

    public void läggTillStudent(Student student){
        studenter[antalStudenter++] = student;
    }

    public void läggTillLärare(Lärare lärare){
        this.lärare = lärare;
    }
}
