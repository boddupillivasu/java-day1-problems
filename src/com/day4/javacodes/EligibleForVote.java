package com.day4.javacodes;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = scanner.nextInt();

        if (age>=18){
            System.out.println("YOUR ELIGIBLE");
        }else {
            System.out.println("YOUR NOT ELIGIBLE");
        }
        scanner.close();
    }
}
