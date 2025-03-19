package com.week1.codes;

import java.util.Scanner;

public class PrintInteger {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        System.out.println("The integer is: " + number);
//        scanner.close();
//
//    }

    public static void printInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("The integer is: " + number);
        scanner.close();

    }

    public static void main(String[] args) {
        printInteger();
    }


}
