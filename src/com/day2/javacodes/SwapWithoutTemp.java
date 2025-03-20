package com.day2.javacodes;

import java.util.Scanner;

public class SwapWithoutTemp {
    public  static  void swapNumWithOutTemp(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a value:");
        int a = scanner.nextInt();

        System.out.println("enter b value:");
        int b = scanner.nextInt();

        //logic

        a = a+b;
        b=a-b;
        a= a-b;

        System.out.println("after swap a is:"+a +"b is"+b);
    }
    public static void swapWithTemp(){



        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a value:");
        int a = scanner.nextInt();

        System.out.println("enter b value:");
        int b = scanner.nextInt();
        int temp =a;
        a =b;
        b=temp;


        System.out.println("after swap a value is:"+a+":b value is:"+b);
    }

    public static void main(String[] args) {
//        swapNumWithOutTemp();
        swapWithTemp();
    }
}
