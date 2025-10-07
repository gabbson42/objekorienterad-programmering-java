package sprint1.ÖvningsUppgifter.Uppgift_3b;

import sprint1.Uppgift_3b.Kurs;
import sprint1.Uppgift_3b.Lärare;
import sprint1.Uppgift_3b.Student;

import java.util.ArrayList;
import java.util.List;

public class Uppgift3b {

    public Uppgift3b() {

        sprint1.Uppgift_3b.Student gabriel = new sprint1.Uppgift_3b.Student("Gabriel", 31);
        sprint1.Uppgift_3b.Student angelica = new sprint1.Uppgift_3b.Student("Angelica", 32);
        sprint1.Uppgift_3b.Student rikard = new sprint1.Uppgift_3b.Student("Rikard", 26);

        List<sprint1.Uppgift_3b.Student> allaStudenter = new ArrayList<>();
        allaStudenter.add(gabriel);
        allaStudenter.add(angelica);
        allaStudenter.add(rikard);

        sprint1.Uppgift_3b.Lärare david = new Lärare("David", 36);

        sprint1.Uppgift_3b.Kurs engelska = new sprint1.Uppgift_3b.Kurs("Engelska");
        sprint1.Uppgift_3b.Kurs svenska = new sprint1.Uppgift_3b.Kurs("Svenska");

        david.undervisarIKurs(engelska);
        engelska.läggTillLärare(david);
        david.undervisarIKurs(svenska);
        svenska.läggTillLärare(david);

        gabriel.deltaIKurs(engelska);
        engelska.läggTillStudent(gabriel);
        gabriel.deltaIKurs(svenska);
        svenska.läggTillStudent(gabriel);

        angelica.deltaIKurs(engelska);
        engelska.läggTillStudent(angelica);

        rikard.deltaIKurs(engelska);
        engelska.läggTillStudent(rikard);

        printKlassLista(engelska);

        printStudentMedKurser(allaStudenter);

    }

    public void printKlassLista(sprint1.Uppgift_3b.Kurs kurs){
        System.out.println("Kurs: " + kurs.getKursNamn() +
                "\nLärare: " + kurs.getLärare().getNamn());

        System.out.println("Studenter: ");
        for(sprint1.Uppgift_3b.Student s : kurs.getStudenter()){
            System.out.println(s.getNamn());
        }
    }

    public void printStudentMedKurser(List<sprint1.Uppgift_3b.Student> allaStudenter){

        for(Student s : allaStudenter){
            System.out.println(s.getNamn());
            for(Kurs k : s.getAllaKurser() ){
                System.out.println("- " + k.getKursNamn());
            }
        }

    }

    public static void main(String[] args) {
        Uppgift3b run = new Uppgift3b();
    }
}
