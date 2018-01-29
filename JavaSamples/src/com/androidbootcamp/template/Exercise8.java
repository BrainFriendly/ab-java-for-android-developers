package com.androidbootcamp.template;

import java.util.Scanner;

/**
 * Created by eduardomedina on 29/01/18.
 Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.

 */
public class Exercise8 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int num;
        int dm, um, c, d, u;
        // 9 9 . 9 9 9  a cada guarismo lo llamaremos:
        //dm um  c d u: dm (decenas de millar), um:(unidades de millar)
        //c: (centenas), d: (decenas), u: (unidades)

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num=in.nextInt();
        // unidad
        u = num % 10;
        num = num / 10;
        // decenas
        d = num % 10;
        num = num / 10;
        // centenas
        c = num % 10;
        num = num / 10;
        // unidades de millar
        um = num % 10;
        num = num / 10;
        // decenas de millar
        dm = num;
        // lo imprimimos al revés:
        System.out.println (u + " " + d + " " + c + " " + um + " " + dm);
        // otra forma de hacerlo es
        num = 10000*u + 1000*d + 100*c + 10*um + dm;
        System.out.println (num);
    }

}
