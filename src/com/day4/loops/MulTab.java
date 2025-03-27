package com.day4.loops;

import java.util.Scanner;

public class MulTab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Ur Table:");
        int tab = scanner.nextInt();


        int table = 0;

        for (int i  =1 ; i<= 20;i++){



            System.out.println(tab+"x"+i+"="+(tab*i));
        }



    }
}
