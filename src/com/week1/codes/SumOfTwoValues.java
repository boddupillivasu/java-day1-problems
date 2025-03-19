package com.week1.codes;

import java.util.Scanner;

public class SumOfTwoValues {

    public static void main(String[] args) {

        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value:");
        int val = scanner.nextInt();
        System.out.println("enter second value:");
        int value = scanner.nextInt();
        result = val+value;
        System.out.println("the final result:"+result);
    }
}
