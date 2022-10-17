import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String routedToDirectory;
        if (n >= 5550000 && n <= 5559999) {
            routedToDirectory = "1";
        }
        else {
            routedToDirectory ="0";
        }
        System.out.println(routedToDirectory);
    }
}

