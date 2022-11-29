import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPlays = 0;
        int countOfWin = 0;

        while (numberOfPlays < 6) {
            String resultOfPlay = input.nextLine();

            if (resultOfPlay.equals("W")) {
                countOfWin++;
            }

            numberOfPlays++;
        }

        if (countOfWin == 5  countOfWin == 6) {
            System.out.println(1);
        } else if (countOfWin == 3  countOfWin == 4) {
            System.out.println(2);
        } else if (countOfWin == 1 || countOfWin == 2) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}

