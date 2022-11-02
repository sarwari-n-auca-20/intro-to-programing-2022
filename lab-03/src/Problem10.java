import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");

        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.sqrt((x*x) + (y*y));

        if (distance <= 10) {
            System.out.printf("point (%.1f, %.1f) is in the circle", x, y);
        } else {
            System.out.printf("point (%.1f, %.1f) is not in the circle", x, y);
        }
    }
}
