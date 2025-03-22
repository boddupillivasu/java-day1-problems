package com.day3.javacodes;

import java.util.Scanner;

public class PosNegAndZero {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a num:");
        int num = scanner.nextInt();

        //logic
        if (num>0){
            System.out.println(num+":positive number");
        } else if (num==0) {
            System.out.println(num+":zero value");

        }else{
            System.out.println(num+":negative value");
        }
    }
}
