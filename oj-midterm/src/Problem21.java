import java.util.Scanner;
public class Problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        String output;
        if (a > b) {
            output = "1";
        } else {
            output = "0";
        }
        System.out.println(output);
    }
}
