import java.sql.SQLOutput;
import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        System.out.println("Hello " + username + "!");
        System.out.println("Your name in upper-case: " + username.toUpperCase());
        System.out.println("Your name in lower-case: " + username.toLowerCase());
        System.out.println("The total number of character is " + username.length());
    }
}
