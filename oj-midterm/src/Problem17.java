import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int S = input.nextInt();
        int M = input.nextInt();
        int L = input.nextInt();
        String BarleyHappinessScore;
        if (S + M * 2 + L * 3 >= 10) {
            BarleyHappinessScore = "happy";
        } else {
            BarleyHappinessScore = "sad";
        }
        System.out.println(BarleyHappinessScore);
    }
}
