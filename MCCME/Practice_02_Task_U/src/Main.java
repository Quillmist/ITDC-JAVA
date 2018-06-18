import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOne, numberTwo, temp1, temp2, result;

        numberOne = in.nextInt();
        numberTwo = in.nextInt();

        temp1 = numberOne % numberTwo;
        temp2 = numberTwo % numberOne;
        result = temp1 *  temp2;

        System.out.println(result+1);

    }
}
