import java.util.Scanner;
public class Problem22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddEven = input.nextInt();

        if (oddEven %2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
