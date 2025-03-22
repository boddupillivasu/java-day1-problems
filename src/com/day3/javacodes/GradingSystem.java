package com.day3.javacodes;

import java.util.Scanner;

public class GradingSystem {

    public static void gradingSystem(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Marks:");
        int marks = scanner.nextInt();

        /*logic
        90>A+
        90< AND >80 = A
        80< AND >70 =B
        70<AND >60 = C
        60< AND >50 = D
        50<AND>40 = E
        40< = F
         */
        if (marks >90) {
            System.out.println(marks + ":A+ GRADE");

        } else if (marks<90 &&marks>80) {
            System.out.println(marks+":A GRADE");

        } else if (marks<80 && marks >70) {
            System.out.println(marks+":B GRADE");

        } else if (marks<70 && marks>60) {
            System.out.println(marks+":C GRADE");

        } else if (marks<60 && marks>50) {
            System.out.println(marks+":D GRADE");

        } else if (marks<50 && marks>40) {
            System.out.println(marks+":E GRADE");

        }else {
            System.out.println(marks+":F GRADE");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        gradingSystem();
    }
}
