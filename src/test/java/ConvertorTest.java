import org.junit.jupiter.api.*;

public class ConvertorTest {

    private static ConvertorUnitatiMasura convertor;

    @BeforeAll
    public static void instantiere (){convertor=new ConvertorUnitatiMasura();}



    @Test
    public void fahrToCelsTest(){
        String result=convertor.fahrenheitToCelsius(66.2);
        Assertions.assertEquals(result,"19.00");
    }

    @Test
    public void mileToKmTest(){
        double result=convertor.milesToKilometers(30);
        Assertions.assertEquals(result,48.2802);

    }

    @Test
    public void poundToKg(){
        double result = convertor.poundsToKilograms(100);
        Assertions.assertEquals(result,45.3592);
    }

    @Test
    public void gallonsToLiters(){
        double result = convertor.galonstoLiters(11);
        Assertions.assertEquals(result,41.63951);
    }

}
