import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n,result;

        m = in.nextInt();
        n = in.nextInt();

        result = (m + n - 1) / m;

        System.out.println(result);
    }
}
