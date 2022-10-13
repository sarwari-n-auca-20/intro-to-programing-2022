import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double lengthInInches = input.nextDouble();
        double CM_PER_INCH =  2.54;
        double lengthInCM = CM_PER_INCH * lengthInInches;
        System.out.printf("%.2f in. = %.2f cm.%n", lengthInInches, lengthInCM);
    }
}
