package com.day4.javacodes;

import java.util.Scanner;

public class DaysUsingSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println(num + ": for monday");
                break;
            case 2:
                System.out.println(num + ": for tuesday");
                break;
            case 3:
                System.out.println(num + ": for Wednesday");
                break;
            case 4:
                System.out.println(num + ": for Thursday");
                break;
            case 5:
                System.out.println(num + ": for Friday");
                break;
            case 6:
                System.out.println(num + ": for Saturday");
                break;
            case 7:
                System.out.println(num + ": for Sunday");
            default:
                System.out.println("invalid number");

                scanner.close();
        }
    }
}
