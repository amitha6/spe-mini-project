import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest {

    private static final double DELTA = 1e-15;
    calculator calci = new calculator();
    @Test
    public void squarerootTrue()
    {
        assertEquals(1, calculator.squareroot(1), DELTA);
        assertEquals(5, calculator.squareroot(25), DELTA);

    }
    @Test
    public void squarerootFalse()
    {
        assertNotEquals(5, calculator.squareroot(100), DELTA);
        assertNotEquals(3, calculator.squareroot(25), DELTA);

    }
    @Test
    public void factorialTrue(){
        assertEquals(2, calculator.factorial(2), DELTA);
    }

    @Test
    public void factorialFalse(){
        assertNotEquals(10, calculator.factorial(3), DELTA);
    }

    @Test
    public void logTrue(){
        assertEquals(0, calculator.lnx(1), DELTA);
    }

    @Test
    public void logFalse(){
        assertNotEquals(1, calculator.lnx(1), DELTA);
    }

    @Test
    public void powerTrue(){
        assertEquals(8, calculator.power(2, 3), DELTA);
    }

    @Test
    public void powerFalse(){
        assertNotEquals(9, calculator.power(2, 4), DELTA);
    }
}
