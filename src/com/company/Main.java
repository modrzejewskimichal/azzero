package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner wej = new Scanner(System.in);
        int a = wej.nextInt();
        while (a != 0) {
            int d, b= wej.nextInt();
            if (b==0){
                System.out.println(a);
            }
            d=a+b;
            a=d;
            }

        }
        // write your code here
    }
