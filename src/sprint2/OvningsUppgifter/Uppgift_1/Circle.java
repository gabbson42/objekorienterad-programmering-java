package sprint2.OvningsUppgifter.Uppgift_1;

public class Circle implements Figure {

    private int radie;

    public Circle(int radie) {
        this.radie = radie;
    }

    @Override
    public double getArea() {
        return Math.pow(radie, 2) * Math.PI;
    }

    @Override
    public double getCircumference() {
        return Math.PI * 2 * radie;
    }
}
