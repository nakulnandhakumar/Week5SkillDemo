import static org.junit.Assert.*;
import org.junit.*;

public class MultTester {
    @Test
    public void testMult(){
        assertEquals(4, Mult.mult(4, 2));
        // should fail because 4*2 != 4
    }
}
