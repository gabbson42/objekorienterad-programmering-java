package sprint1.ÖvningsUppgifter.Uppgift_3b;

import java.util.ArrayList;
import java.util.List;

public class Uppgift3b {

    public Uppgift3b() {

        Student gabriel = new Student("Gabriel", 31);
        Student angelica = new Student("Angelica", 32);
        Student rikard = new Student("Rikard", 26);

        List<Student> allaStudenter = new ArrayList<>();
        allaStudenter.add(gabriel);
        allaStudenter.add(angelica);
        allaStudenter.add(rikard);

        Lärare david = new Lärare("David", 36);

        Kurs engelska = new Kurs("Engelska");
        Kurs svenska = new Kurs("Svenska");

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

    public void printKlassLista(Kurs kurs){
        System.out.println("Kurs: " + kurs.getKursNamn() +
                "\nLärare: " + kurs.getLärare().getNamn());

        System.out.println("Studenter: ");
        for(Student s : kurs.getStudenter()){
            System.out.println(s.getNamn());
        }
    }

    public void printStudentMedKurser(List<Student> allaStudenter){

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
