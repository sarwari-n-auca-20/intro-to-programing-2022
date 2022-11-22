import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int value;
        while (true) {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            value = input.nextInt();
            if (value == 0) {
                break;
            } else {
                sum += value;
            }
        }
            System.out.println("The sum is " + sum);
    }
}
