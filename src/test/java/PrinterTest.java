import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(30, 40);
    }

    @Test
    public void hasSheets(){
        assertEquals(30, printer.getSheets());
    }

    @Test
    public void checkNumberOfSheets(){
        assertEquals(30, printer.numberOfSheets());
    }

    @Test
    public void checkPrintWorks(){
        printer.print(10, 3);
        assertEquals(0, printer.sheets);
    }

    @Test
    public void checkToner(){
        printer.print(10, 3);
        assertEquals(10, printer.tonerVolume);
    }

}
