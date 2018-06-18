import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, hour, minute;

        n = in.nextInt();

        hour = n / 60 % 24;
        minute = n - ((n / 60) * 60);

        System.out.println(hour + " " + minute);

    }
}
