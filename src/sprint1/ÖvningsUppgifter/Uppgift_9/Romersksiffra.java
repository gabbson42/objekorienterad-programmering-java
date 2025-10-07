package sprint1.ÖvningsUppgifter.Uppgift_9;

public enum Romersksiffra {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int number;

    Romersksiffra(int i) {
        number = i;
    }

    public int getNumber() {
        return number;
    }
}
