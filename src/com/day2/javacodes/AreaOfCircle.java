package com.day2.javacodes;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter diameter:");
        int d = scanner.nextInt();
        double r = d/2;
        System.out.println("the radius is:"+r);

        double area= 3.14*r*r;


        System.out.println("the area of a circle:"+area);
    }
}
