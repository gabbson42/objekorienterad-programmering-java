package sprint2.OvningsUppgifter.Uppgift_1;

public class Triangle implements Figure{

    private int length;
    private int width;

    public Triangle(int length, int width){
        this.length = length;
        this.width = width;
    }


    @Override
    public double getArea() {
        return length * width / 2;
    }

    @Override
    public double getCircumference() {
        return (length*2) + width;
    }
}
