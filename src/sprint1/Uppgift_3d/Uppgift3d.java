package sprint1.Uppgift_3d;

import java.util.ArrayList;
import java.util.List;

public class Uppgift3d {

    public Uppgift3d() {

        Student gabriel = new Student("Gabriel", 31);
        Student angelica = new Student("Angelica", 32);
        Student rikard = new Student("Rikard", 26);

        List<Student> studenter = new ArrayList<>();

        studenter.add(gabriel);
        studenter.add(angelica);
        studenter.add(rikard);

        Lärare david = new Lärare("David", 36);

        Kurs engelska = new Kurs("Engelska");
        Kurs svenska = new Kurs("Svenska");

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

        Printer print = new Printer();
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
