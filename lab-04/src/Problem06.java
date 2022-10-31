import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double hDistance = Math.sqrt((x*x) + (y*y));
        double vDistance = Math.sqrt((y*y) + (x*x));

        if (hDistance <= 10.0 / 2 && vDistance <= 5.0 /2) {
            System.out.printf("Point (%.1f , %.1f) is not in the rectangle", x, y);
        } else {
            System.out.printf("Point (%.1f , %.1f) is in the rectangle", x, y);
        }
    }
}
