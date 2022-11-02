import java.util.Random;
import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1st double? ");
        double a = input.nextDouble();
        System.out.print("2nd double? ");
        double b = input.nextDouble();

        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        double rem = a % b;

        System.out.printf("%.1f + %.1f = %.15f%n", a, b, sum);
        System.out.printf("%.1f + %.1f = %.16f%n", a, b, sub);
        System.out.printf("%.1f + %.1f = %.2f%n", a,b, mul);
        System.out.printf("%.1f + %.1f = %.16f%n", a, b , div);
        System.out.printf("%.1f + %.1f = %.16f%n", a, b, rem);
    }
}
