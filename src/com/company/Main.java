package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner wej = new Scanner(System.in);
        int a = wej.nextInt();
        while (a != 0) {
            if (a == 0) {
                System.out.println(a);
            }
            System.out.println("Podaj liczbe");
            Scanner b = new Scanner(System.in);
            int d = b.nextInt();
            System.out.println(d);

        }

        // write your code here
    }
}
