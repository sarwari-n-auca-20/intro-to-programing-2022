import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int child1 = input.nextInt();
        int child2 = input.nextInt();
        int dif = child2 - child1;
        int child3 = dif + child2;
        System.out.println(child3);
    }
}
