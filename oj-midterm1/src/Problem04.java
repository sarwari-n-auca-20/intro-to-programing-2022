import java.util.Scanner;
public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextInt();
        double height = input.nextInt();
        double area = (base * height) / 2;
        System.out.println(area);
    }
}