import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialOfANumberTest {

    @Test
    void shouldReturnTheFactorialOfOne()
    {
        FactorialOfANumber fact = new FactorialOfANumber(1);
        int factorial = fact.factorialOfANumber();
        Assertions.assertEquals(1,factorial);
    }

    @Test
    void shouldReturnTheFactorialOfThree()
    {
        FactorialOfANumber fact = new FactorialOfANumber(3);
        int factorial = fact.factorialOfANumber();
        Assertions.assertEquals(6,factorial);
    }

    @Test
    void shouldReturnTheFactorialOfFive()
    {
        FactorialOfANumber fact = new FactorialOfANumber(5);
        int factorial = fact.factorialOfANumber();
        Assertions.assertEquals(120,factorial);
    }
}