//N школьников делят K яблок поровну, неделящийся остаток остается в корзинке. Сколько яблок останется в корзине?
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k, total, temp;

        System.out.print("Введите количество школьников: ");
        n = in.nextInt();

        System.out.print("Введите количество яблок: ");
        k = in.nextInt();

        temp = k/n;
        total = k - (n*temp);

        System.out.println("В корзине останется " + total + " яблок.");
    }
}
