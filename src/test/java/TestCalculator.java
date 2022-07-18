import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    private final Calculator calculator = new Calculator();

    @Test
    public void calculatorTest(){
        Assert.assertEquals(calculator.add("5", "8"), "58");
    }
}