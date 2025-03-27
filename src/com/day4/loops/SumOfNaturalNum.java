package com.day4.loops;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n value");
        int n = scanner.nextInt();
        int sum =0;

        for (int i =0 ; i<= n ; i++){
            sum +=i;

        }
        System.out.println("the sum of num is:"+sum);
    }
}
