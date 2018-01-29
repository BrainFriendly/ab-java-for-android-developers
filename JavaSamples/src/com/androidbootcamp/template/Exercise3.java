package com.androidbootcamp.template;

import java.util.Scanner;

/**
 * Created by eduardomedina on 29/01/18.

 Pedir dos números y decir si son iguales o no.

 */
public class Exercise3 {

    public static void main(String[] args){
        int n1,n2;

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        n1=in.nextInt();

        System.out.print("Introduce otro número: ");
        n2=in.nextInt();

        if(n1==n2){
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
