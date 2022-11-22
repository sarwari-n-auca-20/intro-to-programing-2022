import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int G = scanner.nextInt();
        int T = scanner.nextInt();
        int N = scanner.nextInt();
        int x;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            x = scanner.nextInt();
            sum += x;
        }
        double weight = (0.9 * (G - T)) - sum;
        System.out.printf("%.0f%n", weight);
    }
}