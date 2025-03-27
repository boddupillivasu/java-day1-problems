package com.Math.codes;

import java.util.Scanner;

public class PrimeOrNOt {

   /*
   logic

   1. prime number >1 or %1
   2.% itself

   false  to prove
   1. if ( number <=1) not prime
   2. if ( int i =2 ; i= math.sqrt(num); I++){
   if (num%2==0)
   not prime

    */

    public  static boolean isPrime(int number){

        if (number<=1){
            return  false;
        }


        for (int i = 2 ; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;



    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ur number:");
        int num = scanner.nextInt();
        if (isPrime(num)){
            System.out.println(num+":Is a prime num");
        }else {
            System.out.println(num+":is not a prime number");
        }
    }

}
