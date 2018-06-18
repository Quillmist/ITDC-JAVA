import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int nextNumber = number + 1;
        System.out.printf("The next number for the number %d is %d.\n", number, nextNumber);

        int previousNumber = number -1;
        System.out.printf("The previous number for the number %d is %d.\n", number, previousNumber);
    }
}
