package com.day4.loops;

import java.util.Scanner;

public class RevOfNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num  = scanner.nextInt();
        int rev =0;

        while (num!=0){

            int rem = num%10;

            rev *=10+rem;
            num /=10;


        }
        System.out.println("after rev of a num:"+ rev);
    }
}
