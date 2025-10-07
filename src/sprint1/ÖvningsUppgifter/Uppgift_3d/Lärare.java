package sprint1.ÖvningsUppgifter.Uppgift_3d;

import sprint1.Uppgift_3d.Kurs;
import sprint1.Uppgift_3d.Person;

import java.util.ArrayList;

public class Lärare extends Person {

    private ArrayList<sprint1.Uppgift_3d.Kurs> undervisarIKurs;

    public Lärare(String namn, int ålder) {
        super(namn, ålder);
        undervisarIKurs = new ArrayList<>();
    }
    public void undervisarIKurs(sprint1.Uppgift_3d.Kurs kurs){
        undervisarIKurs.add(kurs);
    }

    public ArrayList<Kurs> getUndervisarI(){
        return undervisarIKurs;
    }
}
