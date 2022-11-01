import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("points: ");

        double points = input.nextInt();
        if (points <0 || points > 100) {
            System.out.println(points + "is not in the permitted range. ");

        } else if (points >= 90) {
            System.out.println("Grade: A");

        } else if (points >= 80) {
            System.out.println("Grade: B");

        } else if (points >= 70) {
            System.out.println("Grade: C");

        } else if (points >= 60) {
            System.out.println("Grade: D");

        } else if (points > 0) {
            System.out.println("Grade: F");
        }
    }
}
