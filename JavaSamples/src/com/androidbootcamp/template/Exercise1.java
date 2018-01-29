package com.androidbootcamp.template;

import java.util.Scanner;

/**
 * Created by eduardomedina on 29/01/18.

 Write a Java program that takes a number as input and prints its multiplication table up to 10

     Test Data:
     Input a number: 8
     Expected Output :
     8 x 1 = 8
     8 x 2 = 16
     8 x 3 = 24
 */
public class Exercise1 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = in.nextInt();

        for (int i=0; i< 10; i++){

            System.out.println(num1 + " x " + (i+1) + " = " +
                    (num1 * (i+1)));
        }
    }

}
