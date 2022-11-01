import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("complexity level? ");
        int complexityLevel = input.nextInt();

        String msg;
        switch (complexityLevel) {
            case 4:
            case 5:
                msg = "You are a pro gamer.";
                break;
            case 2:
            case 3:
                msg = "You are an experienced gamer.";
                break;
            case 1:
                msg = "You are a biginner.";
                break;
            case 0:
                msg = "You are a total newbie.";
                break;
            default:
                msg = "invalid input.";
        }
        System.out.println(msg);
    }
}
