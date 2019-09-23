import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalculations;

    @Before
    public void before(){
        myCalculations = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(3.00, myCalculations.add(1.00, 2.00), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(1, myCalculations.subtract(5, 4), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(6, myCalculations.multiply(2, 3), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(2, myCalculations.divide(6, 3), 0.01);
    }
}
