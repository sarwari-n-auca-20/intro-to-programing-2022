import java.util.Scanner;
public class Problem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hissingMic = input.next();

        if (hissingMic.contains("ss")) {
            System.out.println("hiss");
        }else {
            System.out.println("not hiss");
        }
    }
}
