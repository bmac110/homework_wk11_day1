import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(30);
    }

    @Test
    public void checkNumberOfSheets(){
        assertEquals(30, printer.numberOfSheets());
    }
}
