import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1st number? ");
        int a = input.nextInt();
        System.out.println("2nd number? ");
        int b = input.nextInt();
        System.out.println("3rd number? ");
        int c = input.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.printf("The value %d is the greatest one%n", a);
            } else {
                System.out.printf("The value %d is the greatest one%n", c);
            }
        } else {
            if (b >= c) {
                System.out.printf("The value %d is the greatest one%n", b);
            } else {
                System.out.printf("The value %d is the greatest one%n", c);
            }
        }
        int maxValue = a;
        if (maxValue < b) {
            maxValue = b;
        }
        if (maxValue < c) {
            maxValue = c;
        }
        System.out.printf("The value %d is the greatest one%n", Math.max(a, Math.max(b, c)));
    }
}
