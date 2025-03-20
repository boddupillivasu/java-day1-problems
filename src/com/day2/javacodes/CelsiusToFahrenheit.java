package com.day2.javacodes;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void celsiusToFahrenheit() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter celsius value:");
        double val = scanner.nextInt();

        //formula for conversion of Celsius to Fahrenheit
        // Celsius val - 32(celsius temp)* 9/5;

        double fahVal = (val*9/5)+32;

        System.out.println("the fahrenheit val:"+fahVal);

    }

    public static void fahToCel(){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fahrenheit value:");
        double val1 = scanner.nextInt();

        //formula for conversion of Celsius to Fahrenheit
        // Celsius val - 32(celsius temp)* 9/5;

        double celVal = (val1-32) *5/9;

        System.out.println("the celsius val:"+celVal);

    }

    public static void main(String[] args) {

//        fahToCel();
        celsiusToFahrenheit();
    }
}
