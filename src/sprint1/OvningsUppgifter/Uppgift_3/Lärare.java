package sprint1.OvningsUppgifter.Uppgift_3;

public class Lärare extends Person {

    private Kurs[] undervisarIKurs;
    private int antalKurser = 0;

    public Lärare(String namn, int ålder) {
        super(namn, ålder);
        undervisarIKurs = new Kurs[5];
    }

    public void undervisarIKurs(Kurs kurs){
        undervisarIKurs[antalKurser++] = kurs;
    }
}
