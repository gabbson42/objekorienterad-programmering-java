package sprint1.ÖvningsUppgifter.Uppgift_3d;

import java.util.ArrayList;

public class Lärare extends Person {

    private ArrayList<Kurs> undervisarIKurs;

    public Lärare(String namn, int ålder) {
        super(namn, ålder);
        undervisarIKurs = new ArrayList<>();
    }
    public void undervisarIKurs(Kurs kurs){
        undervisarIKurs.add(kurs);
    }

    public ArrayList<Kurs> getUndervisarI(){
        return undervisarIKurs;
    }
}
