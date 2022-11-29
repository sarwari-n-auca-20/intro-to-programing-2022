import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int i = 0;
        while (true) {
            if (Math.pow(2, i) < input) {
                i++;
            } else {
                break;
            }
        }
        System.out.println(i);
    }
}