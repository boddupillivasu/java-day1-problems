package com.day4.loops;

import java.util.Scanner;

public class FactOfNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a fact of a num:");
        int num = scanner.nextInt();

        int fact  = 1;

        for ( int i =1; i<=num; i++){

            fact*=i;
        }
        System.out.println("factorial of "+num+":is:"+fact);
    }
}
