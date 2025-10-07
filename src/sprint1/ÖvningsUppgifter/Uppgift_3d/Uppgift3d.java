package sprint1.ÖvningsUppgifter.Uppgift_3d;

import sprint1.Uppgift_3d.Deltagande;
import sprint1.Uppgift_3d.Kurs;
import sprint1.Uppgift_3d.Lärare;
import sprint1.Uppgift_3d.Printer;
import sprint1.Uppgift_3d.Student;

import java.util.ArrayList;
import java.util.List;

public class Uppgift3d {

    public Uppgift3d() {

        sprint1.Uppgift_3d.Student gabriel = new sprint1.Uppgift_3d.Student("Gabriel", 31);
        sprint1.Uppgift_3d.Student angelica = new sprint1.Uppgift_3d.Student("Angelica", 32);
        sprint1.Uppgift_3d.Student rikard = new sprint1.Uppgift_3d.Student("Rikard", 26);

        List<Student> studenter = new ArrayList<>();

        studenter.add(gabriel);
        studenter.add(angelica);
        studenter.add(rikard);

        sprint1.Uppgift_3d.Lärare david = new Lärare("David", 36);

        sprint1.Uppgift_3d.Kurs engelska = new sprint1.Uppgift_3d.Kurs("Engelska");
        sprint1.Uppgift_3d.Kurs svenska = new Kurs("Svenska");

        david.undervisarIKurs(engelska);
        engelska.läggTillLärare(david);
        david.undervisarIKurs(svenska);
        svenska.läggTillLärare(david);

        Deltagande eng1 = new Deltagande(engelska, gabriel);
        Deltagande sve1 = new Deltagande(svenska, gabriel);
        Deltagande eng2 = new Deltagande(engelska, angelica);
        Deltagande eng3 = new Deltagande(engelska, rikard);

        List<Deltagande> deltagare = new ArrayList<>();

        deltagare.add(eng1);
        deltagare.add(sve1);
        deltagare.add(eng2);
        deltagare.add(eng3);

        sprint1.Uppgift_3d.Printer print = new Printer();
        print.printStudent(gabriel, deltagare);
        print.printStudent(angelica, deltagare);
        System.out.println();
        print.printKlassLista(engelska, deltagare);

        System.out.println();
        print.printAll(studenter,deltagare);
    }

    public static void main(String[] args) {
        Uppgift3d run = new Uppgift3d();
    }
}
