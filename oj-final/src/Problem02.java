import java.util.Scanner;
public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            if (i % 2 != 1) {
                System.out.println(input);
            }
        }
    }
}