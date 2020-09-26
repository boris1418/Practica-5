package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static void printNumbers (int x) {

        if (x != 0) {

            int number = x % 10;

            System.out.println(number);

            printNumbers(x / 10);

        }

    }

    public static void main(String[] args) {
        Main.sc = new Scanner(System.in);
        int x = sc.nextInt();
        Main.printNumbers(x);
    }

}