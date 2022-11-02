import java.util.Scanner;
public class Problem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String isMultiple;
        if (num1 % num2 == 0) {
            isMultiple = "yes";
        } else {
            isMultiple = "no";
        }
        System.out.println(isMultiple);

    }
}
