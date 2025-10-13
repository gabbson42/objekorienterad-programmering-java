package sprint2.OvningsUppgifter.Uppgift_1;

import org.junit.jupiter.api.Test;

public class CircleTest {

    Circle c = new Circle(10);

    @Test
    public void getArea(){

        assert(c.getArea() == 10*10*Math.PI);
        assert(c.getArea() == Math.pow(10,2)*Math.PI);
        assert(c.getArea() != 10*Math.PI);
    }

    @Test
    public void getCircumferenceTest(){

        assert(c.getCircumference() == 2*Math.PI*10);
        assert(c.getCircumference() == (10*2)*Math.PI);
    }
}
