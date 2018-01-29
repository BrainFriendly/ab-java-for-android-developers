package com.androidbootcamp.template;

import java.util.Scanner;

/**
 * Created by eduardomedina on 29/01/18.
 *
 Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 
 */
public class Exercise6 {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3  ) / 3);

    }
}
