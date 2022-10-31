import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a < b && b < c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (b < a && a < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (c < b && b < a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        } else if (c < a && b > a) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if (b > a && b > c) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
    }
}