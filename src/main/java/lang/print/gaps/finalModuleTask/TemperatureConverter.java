package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(float temperatureCelsius){

        float temperatureFahrenheit = (temperatureCelsius * 9/5) + 32;
        System.out.println(temperatureFahrenheit);
      //  °F = (°C × 9/5) + 32
      //  °C = (°F − 32) x 5/9
    }

    //You will be given temperature in celsius and your task will be to print this temperature in fahrenheit (formula will be required).
    //Code snippet:

    public static void main(String[] args){
        TemperatureConverter tc = new TemperatureConverter();
        tc.toFahrenheit(5);
    }
}
