package sprint1.ÖvningsUppgifter.Uppgift_3d;

import sprint1.Uppgift_3d.Kurs;
import sprint1.Uppgift_3d.Student;

import java.util.ArrayList;

public class Deltagande {

    private sprint1.Uppgift_3d.Student student;
    private sprint1.Uppgift_3d.Kurs kurs;

    public Deltagande(sprint1.Uppgift_3d.Kurs kurs, sprint1.Uppgift_3d.Student student){
        this.student = student;
        this.kurs = kurs;
    }

    public sprint1.Uppgift_3d.Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public sprint1.Uppgift_3d.Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }
}
