import java.util.Scanner;
public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R1 = input.nextInt();
        int S = input.nextInt();

        int R2 = 2*S - R1;

        if (R1 >=-1000 && R1 <= 1000)
            if (S >=-1000 && S <= 1000)
        System.out.println(R2);
    }
}
