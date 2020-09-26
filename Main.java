package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static int[] findMax () {

        int x = Main.sc.nextInt();

        int[] result = new int[2]; // zero element - maximum, first - repeats
        if (x != 0) {
            int[] prevResult = findMax ();
            if (prevResult[0] < x) {
                result[0] = x;
                result[1] = 1;
            } else if ((prevResult[0] == x)) {
                result[0] = prevResult[0];
                result[1] = prevResult[1] + 1;
            } else {
                result[0] = prevResult[0];
                result[1] = prevResult[1];
            }
        } else {
            result[0] = 0;
            result[1] = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Main.sc = new Scanner(System.in);
        int[] x = Main.findMax();
        System.out.print(x[0] + " " + x[1]);
    }

}