package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static void printNumbers (int i) {

        int x = sc.nextInt();

        if (x != 0) {

            if (i % 2 != 0) {
                System.out.println(x);
            }

            printNumbers(i + 1);

        }

    }

    public static void main(String[] args) {
        Main.sc = new Scanner(System.in);
        Main.printNumbers(1);
    }

}