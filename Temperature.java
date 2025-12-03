import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        
        System.out.println("Temperature in Kelvin: " + kelvin);
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
       
    }
}
