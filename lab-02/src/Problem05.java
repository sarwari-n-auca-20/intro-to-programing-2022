import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Temperature in degrees Fahrenheit? ");
            double temperatureFahrenheit = input.nextDouble();
            double temperatureCelsius =  5.0 / 9 * (temperatureFahrenheit - 32);
            System.out.printf("The temperature in degrees Celsius is %.2f", temperatureCelsius);
        }
    }
}
