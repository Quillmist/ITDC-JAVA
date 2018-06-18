import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, first, second, secondDigit, secondDigit2;

        number = in.nextInt();

        first = number / 100;
        secondDigit = number / 10 % 10;
        secondDigit2 = number % 10;
        second = secondDigit2 * 10 + secondDigit;

        System.out.println(first - second + 1);
    }
}
