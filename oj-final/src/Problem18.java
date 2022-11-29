import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int i = 1;

        while (true) {
            if (i * i < input) {
                i++;
            } else {
                break;
            }
        }

        if (i * i > input) {
            System.out.println("The largest square has side length " + (i - 1) + ".");
        } else {
            System.out.println("The largest square has side length " + i + ".");
        }
    }
}