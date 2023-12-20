import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {

    @Test
    public void TestCheckIsPositive(){
        IsPositive isPositive=new IsPositive();
        boolean result = isPositive.checkIsPositive(6);
        Assertions.assertTrue(result);
    }

    @Test
    public void TestCheckIsNegative(){
        IsPositive isNegative=new IsPositive();
        boolean result = isNegative.checkIsPositive(-6);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest

    @ValueSource(ints = {1,3,5,86,100,Integer.MAX_VALUE})
    public void checkIsPositiveParameterized(int numar)
    {
        IsPositive isPositive=new IsPositive();
        boolean result = isPositive.checkIsPositive(numar);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,-2,-50,-170,Integer.MIN_VALUE})
    public void checkIsNegativeParameterized(int numar){
        IsPositive isNegative=new IsPositive();
        boolean result = isNegative.checkIsPositive(numar);
        Assertions.assertFalse(result);
    }

}
