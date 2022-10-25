import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double dis = Math.pow(b, 2) - 4 * a * c;
        double r1;
        double r2;

        if (dis > 0) {
            r1 = (-b + Math.pow(dis, 0.5)) / 2 * a;
            r2 = (-b - Math.pow(dis, 0.5)) / 2 * a;
            System.out.printf("This equation has two roots %.6f and %.5f", r1, r2);
        } else if (dis == 0) {
            r1 = (-b + Math.pow(dis, 0.5)) / 2 * a;
            System.out.printf("This equation has one roots %.0f", r1);
        } else {
            System.out.printf("This equation has no real roots");
        }
    }
}
