import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int d = input.nextInt();
            int h = input.nextInt();

            int c = (3 + h) * h / 2 ;

            System.out.println(d + " " + c);
        }
    }
}