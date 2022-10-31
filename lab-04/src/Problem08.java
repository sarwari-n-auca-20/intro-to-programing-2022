import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double weightOfPackage = input.nextDouble();

        if (weightOfPackage < 0) {
            System.out.println("Invalid input.");
        } else if (weightOfPackage > 20) {
            System.out.println("The package cannot be shipped.");
        } else if (weightOfPackage <= 1) {
         System.out.println("Shipping cost is 3.5.");
        } else if (weightOfPackage <= 3) {
            System.out.println("Shipping cost is 5.5.");
        } else if (weightOfPackage <= 10) {
            System.out.println("Shipping cost is 8.5.");
        } else if (weightOfPackage <= 20) {
            System.out.println("Shipping cost is 10.5.");
        }
    }
}
