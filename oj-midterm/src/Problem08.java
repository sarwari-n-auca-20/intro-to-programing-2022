import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int T = input.nextInt();
        int M = input.nextInt();
        int AllDesigns = (N * T * M);
        if (N >=1 && N <= 500)
            if (T >=1 && T <= 500)
                if (M >=1 && M <= 500)
            System.out.println(AllDesigns);
    }
}
