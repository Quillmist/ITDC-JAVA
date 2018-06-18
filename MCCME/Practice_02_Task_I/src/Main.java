import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        number = in.nextInt();

        System.out.println((number % 10) + (number / 100) + ((number / 10)%10));

    }
}
