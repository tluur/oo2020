import org.junit.Test;
import static org.junit.Assert.*;

public class Testime {

    @Test
    public void testOnVõitja() {
        System.out.println("On võitja");
        String _marker = "";
        mAla instance = new mAla();
        boolean expResult = false;
        boolean result = instance.OnVoitja(_marker);
        assertEquals(expResult, result);
    }

    @Test
    public void testMänguAla() {
        System.out.println("Mängu ala");
        mAla instance = new mAla();
        instance.PrintmAla();

    }

}
