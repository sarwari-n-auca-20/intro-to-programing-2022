import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a degree in celsius: ");
        double Celsius = input.nextDouble();

        double degreeInFahrenheit = (9.0/5) * Celsius + 32;
        System.out.println(Celsius + " Celsius " + "is " + degreeInFahrenheit + " Fahrenheit" );
//        System.out.print("Enter a degree in Celsius : ");
//        double celsius = input.nextDouble();
//        double fahrenheit = (9.0/5) * celsius + 32;
//        System.out.println(celsius + " Celsius" + " is " +  fahrenheit + " Fahrenheit");
    }
}
