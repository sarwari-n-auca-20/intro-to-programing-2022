import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        int extraCheesiness = input.nextInt();
        String M;
        if (width == 3 && extraCheesiness >= 95){
            System.out.println("C.C. is absolutely satisfied with her pizza.");
        } else if (width == 1 && extraCheesiness <= 50) {
            System.out.println("C.C. is fairly satisfied with her pizza.");
        } else if (width == 2 && extraCheesiness > 50) {
            System.out.println("C.C. is very satisfied with her pizza.");
        }
    }
}
