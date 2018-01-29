package com.androidbootcamp.template;

import java.util.Scanner;

/**
 * Created by eduardomedina on 29/01/18.
 Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.

 */
public class Exercise9 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un número: ");
        num=in.nextInt();
        while(num!=0) // mientras num sea distinto de 0
        {
            if(num%2 == 0)
                // si el resto de dividir entre dos es cero: esto indica que es par
                System.out.println("Par");
            else
                // en caso contrario: impar
                System.out.println("Impar");
            // repetimos el proceso y volvemos a leer num
            System.out.print("Introduzca otro número: ");
            num=in.nextInt();
        }
        // al salir del mientras tenemos la certeza que num es 0
    }

}
