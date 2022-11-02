import java.util.Scanner;
public class Problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a >= b) {
            System.out.println(b + " " + a);
        } else {
            System.out.println(a + " " + b);
//            System.out.print(b + " ");
//            System.out.println(a);
//        }else {
//            System.out.print(a + " ");
//            System.out.println(b);
        }
    }
}
