package sprint1.ÖvningsUppgifter.Uppgift_3d;

import java.util.List;

public class Printer {

    public void printStudent(Student student, List<Deltagande> deltagande) {
        System.out.println(student.getNamn());
        for (Deltagande d : deltagande) {
            if (d.getStudent().getNamn().equals(student.getNamn())) {
                System.out.println("- " + d.getKurs().getKursNamn());
            }
        }
    }

    public void printKlassLista(Kurs kurs, List<Deltagande> deltagande) {
        System.out.println("Kurs: " + kurs.getKursNamn() +
                "\nLärare: " + kurs.getLärare().getNamn());

        System.out.println("Studenter");
        for (Deltagande d : deltagande) {
            if (d.getKurs().getKursNamn().equals(kurs.getKursNamn())) {
                System.out.println("- " + d.getStudent().getNamn());
            }
        }
    }

    public void printAll(List<Student> studenter, List<Deltagande> deltagare){

       for(Student s : studenter){
           System.out.println("Student: " + s.getNamn());
           for(Deltagande d : deltagare){
               if(d.getStudent().equals(s)){
                   System.out.println("- " + d.getKurs().getKursNamn());
               }
           }
       }
    }
}
