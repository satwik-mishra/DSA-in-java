package OOPS;
class Temperature
{
    double celsiusToFahrenheit(double c)
    {
        return (9/5)*c+32;
    }
    double fahrenheitToCelsius(double f)
    {
        return (5/9)*f-32;
    }
}
public class level03_b {
    public static void main(String[] args) {
        Temperature t1=new Temperature();
        double c=25;
        double f=77;
        System.out.println("Celsius to Fahrenheit: " + t1.celsiusToFahrenheit(c));
        System.out.println("Fahrenheit to Celsius: " + t1.fahrenheitToCelsius(f));
    }
}
