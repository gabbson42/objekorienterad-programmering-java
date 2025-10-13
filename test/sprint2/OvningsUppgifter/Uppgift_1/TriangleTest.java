package sprint2.OvningsUppgifter.Uppgift_1;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    Triangle t = new Triangle(5, 10);

    @Test
    public void getAreaTest(){

        assert (t.getArea() == 5*10 / 2);
        assert (t.getArea() != 5*10);

    }

    @Test
    public void getCircumferenceTest(){

        assert(t.getCircumference() == (5*2) + 10);
        assert(t.getCircumference() != 5+10);

    }

}
