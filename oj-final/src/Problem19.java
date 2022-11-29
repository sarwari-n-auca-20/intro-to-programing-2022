import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int a = 1;
        int x = 1;

        while (x > 0) {
            if ((a * n) % m == 1) {
                System.out.println(a);
                break;
            }
            if (a > m) {
                System.out.println("No such integer exists.");
                break;
            }
            a++;
            x++;
        }
    }
}