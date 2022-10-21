import java.util.Scanner;
public class Problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N1 = input.nextInt();
        String S = input.nextLine();
        int N2 = 8;
        if (1 <= N1 && N1 <= 1000) {
            if (N1 >N2) {
                System.out.println("Before");
                System.out.println(N1 - N2);
                System.out.println(N1 - (N1 -N2));
            }
            else{
                if (N1 < N2) {
                    System.out.println("After");
                    System.out.println(N1 + N2);
                    System.out.println(N1 - (N1 -N2));
                }
            }
        }
    }
}
