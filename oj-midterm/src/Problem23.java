import java.util.Scanner;
public class Problem23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt(), h = input.nextInt();
        int total = h * 60 * m - 45;
        if (total < 0) {
            total = 1440 + total;
        }
        int newh = total / 60;
        int newm = total % 60;
        System.out.println(newh + " " + newm);
    }
}
