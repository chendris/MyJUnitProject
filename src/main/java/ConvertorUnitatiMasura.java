import java.text.DecimalFormat;

import static java.lang.Math.round;

public class ConvertorUnitatiMasura {



    public String fahrenheitToCelsius(double grad){

        double celsius=(grad-32) *(5.00/9.00);
        return String.format("%.2f",celsius);
    }

    public double milesToKilometers(double miles){
        return miles*1.60934;
    }

    public double poundsToKilograms(double pounds){
        return pounds*0.453592;
    }

    public double galonstoLiters(double liters){
        return liters*3.78541;
    }
}
