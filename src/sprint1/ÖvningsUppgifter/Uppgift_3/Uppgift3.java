package sprint1.ÖvningsUppgifter.Uppgift_3;

public class Uppgift3 {

    public Uppgift3() {

        Student gabriel = new Student("Gabriel", 31);
        Student angelica = new Student("Angelica", 32);
        Student rikard = new Student("Rikard", 26);

        Lärare david = new Lärare("David", 36);

        Kurs engelska = new Kurs("Engelska");

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
