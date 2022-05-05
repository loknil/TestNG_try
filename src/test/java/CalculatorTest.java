import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {


    @Test
    void adds() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.add(2, 1));

    }

    @Test
    void subtracts() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.subtract(2,1));

    }
}