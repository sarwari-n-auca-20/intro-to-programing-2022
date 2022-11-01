import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Year? ");
        int year = input.nextInt();
        System.out.println("Month? ");
        int month = input.nextInt();

        switch (year) {
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days: 30");
                break;
            default:
                boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
                System.out.println(" Number of days: " + (isLeapYear ? 29 : 30));
        }
    }
}
