package com.day4.javacodes;

import java.util.Scanner;

public class VowelsOrConsonants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character:");
        char ch = scanner.next().charAt(0);

        // logic print vowels

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + ":it is a vowel");

        } else {
            System.out.println(ch + ":it is a consonant");
        }
        scanner.close();
    }
}
