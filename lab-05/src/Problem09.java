import java.util.Scanner;
public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scanner.next();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                System.out.println(s + " is a palindrome.");
            } else {
                System.out.println(s + " is  not a palindrome.");
            }
            break;
        }
    }
}