import java.util.Scanner;
public class Problem01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String greeting = input.next();
        int nELetters = greeting.length() - 2;
        System.out.print("h");
        for (int i = 0; i < 2 * nELetters; ++i) {
            System.out.print("e");
        }
        System.out.println("y");
    }
}