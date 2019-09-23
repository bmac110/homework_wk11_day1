import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }

    @Test
    public void hasWater(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void waterLessVolume(){
        assertEquals(90, bottle.drinkWater());
    }

    @Test
    public void checkBottleIsEmpty(){
        assertEquals(0, bottle.emptyBottle());
    }

    @Test
    public void checkBottleIsFull(){
        assertEquals(100, bottle.fillBottle());
    }
}
