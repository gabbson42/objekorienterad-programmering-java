package sprint1.Uppgift_9;

public class Uppgift9 {

    public static void main(String[] args){

        for(Romersksiffra r : Romersksiffra.values()){
            System.out.println(r + " is " + r.getNumber());
        }
    }
}
