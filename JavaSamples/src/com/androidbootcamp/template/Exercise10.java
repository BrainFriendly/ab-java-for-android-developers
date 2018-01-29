package com.androidbootcamp.template;

import java.util.Scanner;

/**
 * Created by eduardomedina on 29/01/18.

 Pedir un número N, y mostrar todos los números del 1 al N

 */
public class Exercise10 {

    public static void main(String[] args) {
        int i,num;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num=in.nextInt();
        i=1;
        // i es el contador que tomará los valores de 1 a n
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
