import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,n, rub, kopeika,temp, total;
        a = in.nextInt();
        b = in.nextInt();
        n = in.nextInt();

        temp = a*100;
        kopeika = temp + b;
        total = kopeika * n;
        System.out.println((total / 100) + " " + (total - total / 100));
    }
}
