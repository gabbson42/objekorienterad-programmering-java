package sprint1.OvningsUppgifter.Uppgift_3d;

public class Deltagande {

    private Student student;
    private Kurs kurs;

    public Deltagande(Kurs kurs, Student student){
        this.student = student;
        this.kurs = kurs;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }
}
