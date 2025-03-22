package com.day3.javacodes;

import java.util.Scanner;

public class LeapYearOrNot {
    public  static void leapYearOrNOT(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year:");
        int year = scanner.nextInt();

        //logic year%4,400,40

        if(year%4 == 0 || year%400 == 0 || year% 40 == 0){

            System.out.println(year+":is  a leap year");
        }else {
            System.out.println(year+":is a not leap year");
        }
    }

    public static void main(String[] args) {
        leapYearOrNOT();
    }
}
