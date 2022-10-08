import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        System.out.print("what is your name?");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        System.out.println(" hello, " + username + "!");
        System.out.println("Your name in upper-case:" + username.toUpperCase());
        System.out.println("Your name in lower-case:"+ username.toLowerCase());
        System.out.println("The total number of characters is " +username.length());
        System.out.println(username.length());

    }
}
