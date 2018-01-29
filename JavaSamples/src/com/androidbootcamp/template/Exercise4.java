package com.androidbootcamp.template;

import java.util.Scanner;

/**
 * Created by eduardomedina on 29/01/18.


 Pedir dos números y decir cual es el mayor.

 */
public class Exercise4 {

    public static void main(String[] args){

        int n1,n2;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        n1=in.nextInt();

        System.out.print("Introduce otro número: ");
        n2=in.nextInt();

        // si ambos números son iguales diría que n2 es mayor que n1

        if(n1>n2)
            System.out.println(n1 + " es mayor que " + n2);
        else
            System.out.println(n2 + " es mayor que " + n1);
    }


}
