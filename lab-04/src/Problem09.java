import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edge1 = input.nextInt();
        int edge2 = input.nextInt();
        int edge3 = input.nextInt();

        int perimeter = edge1 + edge2 + edge3;

        if ((edge1 + edge2) > edge3 ) {
            System.out.println(perimeter);
        } else {
            System.out.println("The input is invalid");
        }
    }
}
