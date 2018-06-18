package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k, total;
        n = in.nextInt();
        k = in.nextInt();
        total = k/n;

        System.out.println(total);
    }
}
