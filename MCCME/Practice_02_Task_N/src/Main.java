import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, totalMinutes, hours, minutes;
        n = in.nextInt();
        totalMinutes = n * 45 + (n / 2) * 5 + ((n - 1) / 2) * 15;
        hours = 9 + totalMinutes / 60;
        minutes = totalMinutes % 60;
        System.out.println(hours + " " + minutes);
    }
}
