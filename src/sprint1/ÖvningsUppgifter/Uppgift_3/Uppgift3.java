package sprint1.ÖvningsUppgifter.Uppgift_3;

import sprint1.Uppgift_3.Kurs;
import sprint1.Uppgift_3.Lärare;
import sprint1.Uppgift_3.Student;

public class Uppgift3 {

    public Uppgift3() {

        sprint1.Uppgift_3.Student gabriel = new sprint1.Uppgift_3.Student("Gabriel", 31);
        sprint1.Uppgift_3.Student angelica = new sprint1.Uppgift_3.Student("Angelica", 32);
        sprint1.Uppgift_3.Student rikard = new sprint1.Uppgift_3.Student("Rikard", 26);

        sprint1.Uppgift_3.Lärare david = new Lärare("David", 36);

        sprint1.Uppgift_3.Kurs engelska = new sprint1.Uppgift_3.Kurs("Engelska");

        david.undervisarIKurs(engelska);
        engelska.läggTillLärare(david);

        gabriel.deltaIKurs(engelska);
        engelska.läggTillStudent(gabriel);

        angelica.deltaIKurs(engelska);
        engelska.läggTillStudent(angelica);

        rikard.deltaIKurs(engelska);
        engelska.läggTillStudent(rikard);

        printKlassLista(engelska);

    }

    public void printKlassLista(Kurs kurs) {
        System.out.println("Kurs: " + kurs.getKursNamn());
        System.out.println("Lärare: " + kurs.getLärare().getNamn());
        System.out.println();
        System.out.println("Studenter: ");

        for (Student s : kurs.getStudenter()) {
            if (s != null) {
                System.out.println(s.getNamn());
            }
            else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        Uppgift3 run = new Uppgift3();
    }
}
