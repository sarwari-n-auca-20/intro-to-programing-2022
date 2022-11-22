import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        double sum = 0;
        double divisor = b;

        for (int i = 0; i < b; i++) {
            double slugging = sc.nextInt();
            if (slugging >= 0) {
                sum = sum + slugging;
            } else {
                divisor = divisor - 1;
            }
        }
        System.out.println(sum / divisor);
    }
}