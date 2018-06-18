/* Сложить два числа. */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a,b,sum; // int

        System.out.print("Первое число: ");
        a = in.nextLong(); // nextInt

        System.out.print("Второе число: ");
        b = in.nextLong(); // nextInt

        sum=a+b;

        System.out.printf("%d + %d = %d\n", a, b, sum); // "%d" - для чисел, "%s" - для строк, "\n" - переход на новую строку
        // обязательно использовать printf
//        ystem.out.println("Result: " + a + "+" + b + " = " + sum);
    }
}
