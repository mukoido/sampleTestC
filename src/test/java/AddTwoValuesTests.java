import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testMultiplyTwoValues() {
        assertEquals("10 * 5 must be 50", 50, calc.multiply(10, 5));
    }
    @Test
    public void testDivisionTwoValues() {
        assertEquals("10 / 5 must be 2", 2.0, calc.division(10, 5));
    }
    @Test
    public void testSubtractionTwoValues() {
        assertEquals("10 - 5 must be 8", 5.0, calc.division(10, 2));
    }

    @Test
    public void testX2() {
        assertEquals("2*2 must be 4", 4.0, calc.powTwo(2));
    }

    @Test
    public void squareRoot() {
        assertEquals("squareRoot from 4 must be 2", 2.0, calc.squareRoot(4));
    }
    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
