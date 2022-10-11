import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Big = input.nextInt();
        int small = input.nextInt();
        int left = (Big * 8) + (small * 3) -28;
        System.out.println(left);
    }
}