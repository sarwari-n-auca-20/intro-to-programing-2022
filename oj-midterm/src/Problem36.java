import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAntennae = input.nextInt();
        int numEyes = input.nextInt();
        if (numAntennae >= 3 && numEyes <= 4) {
            System.out.println("TroyMartian");
        } else if (numAntennae <= 6 && numEyes >= 2) {
            System.out.println("VladSaturnian");
        } else if (numAntennae <= 2 && numEyes <=3) {
            System.out.println("GraemeMercurian");
        } else {
            System.out.println("");
        }
    }
}
