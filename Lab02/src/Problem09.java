import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long years = minutes / (365 * 24 * 60);
        long yearsToMins = years * 525600;
        long roMin = minutes - yearsToMins;
        long days = roMin / (24 * 60);
        System.out.println(minutes  + " minutes " + " is approximately " + years + " years and " + days + " days ");
    }
}
