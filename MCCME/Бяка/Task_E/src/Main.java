import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int speed,time,position;

        speed = in.nextInt();
        time = in.nextInt();

        position = speed * time % 109;
        position += 109;
        position %= 109;
        System.out.println(position);


    }
}


