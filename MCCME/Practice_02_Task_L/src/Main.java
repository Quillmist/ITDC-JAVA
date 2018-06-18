import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s, h, m;
        s = in.nextInt();
        h = s / 60 / 60 % 24;
        m = s / 60 % 60;
        s = s % 60;
        System.out.printf("%d:%02d:%02d\n",h,m,s);
    }
}
