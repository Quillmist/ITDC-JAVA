import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,temp;

        a = in.nextInt();
        b = in.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
