import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        if (a + b + c + d <= 10) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
