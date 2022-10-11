import java.sql.SQLOutput;
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        if (v >= 1 && v <= Math.pow(10,9)){
            double t = (2 * v) / (9.8);
            System.out.printf("%.6f", t);
        }
    }
}
