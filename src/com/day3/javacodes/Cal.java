package com.day3.javacodes;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number:");
      int num = scanner.nextInt();
        System.out.println("enter second number:");
       int val = scanner.nextInt();

        System.out.println("enter operator: +,-,/,*,%");
        char operator = scanner.next().charAt(0);

        switch ( operator){
            case '+':
                System.out.println("sum of two values:"+(num+val));
                break;
            case '-':
                System.out.println("minus of two values:"+(num-val));
                break;
            case '*':
                System.out.println("multiply of two values:"+(num*val));
                break;
            case '/':
                System.out.println("divisible of two values:"+(num/val));
                break;
            case '%':
                System.out.println("mod of two values:"+(num%val));
                break;
            default:
                System.out.println("default operation");


        }
        scanner.close();


    }
}
