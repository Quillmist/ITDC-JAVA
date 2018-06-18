//Сделайте запрос имени у пользователя и выведите приветствие для этого пользователя.
//    Как вас зовут? Дмитрий
//        Привет, Дмитрий.
package com.company;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String name;
        System.out.println("Как вас зовут?");
        name = in.nextLine();
        System.out.println("Привет, " + name);

    }
}
