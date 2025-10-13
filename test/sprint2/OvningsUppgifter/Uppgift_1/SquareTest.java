package sprint2.OvningsUppgifter.Uppgift_1;

import org.junit.jupiter.api.Test;

public class SquareTest {

    Square s = new Square(5, 4);


    @Test
    public void getAreaTest(){

        assert(s.getArea() == 20);
        assert(s.getArea() != 30);
    }

    @Test
    public void getCircumferenceTest(){

        assert(s.getCircumference() == (5*2) + (4*2));
        assert (s.getCircumference() == 5+5+4+4);
        assert (s.getCircumference() != 5*4);
    }

}
