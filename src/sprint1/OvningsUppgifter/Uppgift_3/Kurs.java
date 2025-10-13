package sprint1.OvningsUppgifter.Uppgift_3;

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
