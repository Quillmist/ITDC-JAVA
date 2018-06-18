import java.util.Scanner;
// Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h, a, b;

        h = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();

        int diff = a -b;
        int rh = h - a;


        System.out.println(1 + rh / diff + (rh % diff + diff -1 )/ diff);


    }
}
