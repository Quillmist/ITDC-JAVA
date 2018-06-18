import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, result;

        number = in.nextInt();

        result = (number / 2) * 2 + 2;

        System.out.println(result);

    }
}
