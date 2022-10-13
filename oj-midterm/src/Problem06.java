import java.util.Scanner;

public class Problem06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        int length = input.nextInt();
        int sideLength = input.nextInt();
        int div = width / sideLength;
        int divLength = length / sideLength;
        if (width >=1 && width <= 1000)
            if (length >= 1 && length <= 1000)
                if (sideLength >= 1 && sideLength <= 1000)
        System.out.println(div * divLength);
    }
}

