package com.day2.javacodes;

import java.util.Scanner;

public class FindLargestOfThree {

    public static void findLargestOfThree(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = scanner.nextInt();
        System.out.println("Enter b value:");
        int b = scanner.nextInt();
        System.out.println("Enter c value:");
        int c = scanner.nextInt();

        // condition
        if (a >b && a> c){
            System.out.println("The Largest Value: "+a);
        } else if (b> a && b>c) {
            System.out.println("The Largest Value: "+b);

        } else if (c>a && c>b) {
            System.out.println("The Largest Value: "+c);

        }else {
            System.out.println("some of  the two values is same");
        }

    }

    public static void main(String[] args) {
        findLargestOfThree();
    }
}
