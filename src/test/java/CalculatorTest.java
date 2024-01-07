import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;




public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void instantiere (){
        calculator=new Calculator();
    }

    @Test
    public void addTest() {
        //Calculator calculator=new Calculator();
        int result= calculator.add(2,3);
        Assertions.assertEquals(result,5);
    }

    @Test
    public void difTest(){
        //Calculator calculator=new Calculator();
        int result= calculator.dif(3,2);
        Assertions.assertEquals(result,1);
    }

    @Test
    public void multiplyTest(){
      // Calculator calculator=new Calculator();
        int result= calculator.multiply(3,2);
        Assertions.assertEquals(result,6);
    }

    @Test
    public void divideTest(){
        //Calculator calculator=new Calculator();
        int result= calculator.divide(6,2);
        Assertions.assertEquals(result,3);
    }

    @Test
    public void restTest(){
        int result = calculator.rest(6,4);
        Assertions.assertEquals(result,2);
    }

}
