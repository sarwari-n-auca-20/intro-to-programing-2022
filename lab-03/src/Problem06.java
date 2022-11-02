import java.sql.SQLOutput;
import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
        double r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;

        if (discriminant > 0) {
            System.out.printf("This equation has two roots %.6f and %.5f", r1, r2);
        } else if (discriminant == 0) {
            System.out.printf("This equation has one root %.0f", r1);
        } else {
            System.out.print("This equation has no real roots");
        }
    }
}
