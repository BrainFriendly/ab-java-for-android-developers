package com.androidbootcamp.template;

import java.util.Scanner;

/**
 * Created by eduardomedina on 29/01/18.
 Pedir tres números y mostrar el menor

 */
public class Exercise7 {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        int[] elements= { num1,num2,num3 };

        //fori
        int menor= num1;

        for (int i = 0; i < 3; i++) {
            if(menor>elements[i]){
                menor= elements[i];
            }

        }

        System.out.println("El numero menor es: "+menor+"\n");
    }
}
