package com.company;

import java.util.Scanner;

public class Main {

    static public Scanner sc;

    static public void findNotOdd () {

        int x = sc.nextInt();

        if (x != 0) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            Main.findNotOdd();
        }

    }

    public static void main(String[] args) {

        Main.sc = new Scanner(System.in);
        Main.findNotOdd();

    }

}