import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest {

    private static final double DELTA = 1e-15;
    calculator calci = new calculator();
    @Test
    public void sqrootTruePositive()
    {
        assertEquals(1, calculator.squareroot(1), DELTA);
        assertEquals(5, calculator.squareroot(25), DELTA);

    }
}
