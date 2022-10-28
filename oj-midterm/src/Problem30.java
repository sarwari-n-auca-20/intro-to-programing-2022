import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angles1 = input.nextInt();
        int angles2 = input.nextInt();
        int angles3 = input.nextInt();

        if ( angles3 == 60 && angles1 == 60 && angles2 == 60) {
            System.out.println("Equilateral");
        } else if ((angles3 + angles2 + angles1 == 180) && (angles1 == angles2 || angles1 == angles3 ||
                angles2 == angles3)){
            System.out.println("Isosceles");
        } else if ((angles3 + angles2 + angles1 == 180) &&
                (angles1 != angles2 && angles1 != angles3 && angles2 != angles3)){
            System.out.println("Scalene");
        } else if (angles3 + angles2 + angles1 != 180) {
            System.out.println("Error");
        }
    }
}
