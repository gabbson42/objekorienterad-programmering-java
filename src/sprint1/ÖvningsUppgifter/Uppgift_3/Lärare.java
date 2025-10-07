package sprint1.ÖvningsUppgifter.Uppgift_3;

import sprint1.Uppgift_3.Kurs;
import sprint1.Uppgift_3.Person;

public class Lärare extends Person {

    private sprint1.Uppgift_3.Kurs[] undervisarIKurs;
    private int antalKurser = 0;

    public Lärare(String namn, int ålder) {
        super(namn, ålder);
        undervisarIKurs = new sprint1.Uppgift_3.Kurs[5];
    }

    public void undervisarIKurs(Kurs kurs){
        undervisarIKurs[antalKurser++] = kurs;
    }
}
