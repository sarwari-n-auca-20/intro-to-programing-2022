import java.util.Scanner;
public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long years = minutes / (365 * 24 * 60);
        long yearsToMin = years * 525600;
        long reMin = minutes - yearsToMin;
        long days = reMin / (24 * 60);

        System.out.println(minutes + " minutes " + "is approximately " + years + " years and " + days + " days ");
//        long minutes = input.nextLong();
//        long years = minutes / (365 * 24 * 60);
//        long yearsToMin = years * 525600;
//        long roMin = minutes - yearsToMin;
//        long days = roMin / (24 * 60);
//        System.out.println(minutes  + " minutes " + " is approximately " + years + " years and " + days + " days ");
    }
}
