import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        if (num1 == 8 || num1 == 9 && num4 == 8 || num4 == 9 && num2 == num3) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}
