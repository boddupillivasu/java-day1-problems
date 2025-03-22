package com.day3.javacodes;

import java.util.Scanner;

public class FindMax {

    public static void findMaxVal(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  four numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int max = Math.max(a,Math.max(b,Math.max(c,d)));
        System.out.println("the max values:"+max);
        scanner.close();

    }

    public static void main(String[] args) {

        findMaxVal();
    }

}
