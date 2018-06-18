import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, digit;
        number = in.nextInt();

        digit = (number / 10) % 10;
        System.out.println(digit);
    }
}
