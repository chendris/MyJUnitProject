import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyStringTest {

    private static MyString myString;

    @BeforeAll
    public static void instantiere (){myString=new MyString();}

    @Test
    public void metoda1Test(){
        int result= myString.metoda1("ana are mere");
        Assertions.assertEquals(result,12);
    }

    @Test
    public void metoda2Test(){
        String result = myString.metoda2("ana","are","mere");
        Assertions.assertEquals(result,"ana are mere");
    }

    @Test
    public void metoda3Test(){
        boolean result = myString.metoda3("albina");
        Assertions.assertEquals(result,true);
    }

    @Test
    public void metoda4Test(){
        String result= myString.metoda4("albina");
        Assertions.assertEquals(result,"anibla");
    }


}
