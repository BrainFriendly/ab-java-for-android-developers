package com.androidbootcamp.template;

import com.androidbootcamp.template.poo.Persona;
import com.sun.deploy.perf.PerfRollup;

/**
 * Created by eduardomedina on 29/01/18.
 */
public class Main {

    public static void main(String[] args)
    {
        /**
         * Tipo Comentario 1
         **/
        /* Tipo Comentario 2 */
        // Tipo Comentario 3

        int edad = 21;
        float velocidad = 45.5f;
        double temperatura = 23.5;
        boolean estaCorriendo = true;
        long milisegundos = 10929239101023L;
        char letra = 'C';
        String oracion = "Este es el ejemplo de una oracion en Java";

        System.out.println(edad);
        System.out.println(velocidad);


        //--------------------------

        boolean resultadoExitoso = true;
        char cMayuscula = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;

        // El numero 26 en decimal
        int decVal = 26;
        //  El numero 26 en hexadecimal
        int hexVal = 0x1a;
        // El numero 26 en binario
        int binVal = 0b11010;

        double d1 = 123.4;
        // Mismo valor que en d1, pero en notacion cientifica
        double d2 = 1.234e2;
        float f1  = 123.4f;

        System.out.println(f1);

        //arreglos

        int[] anArray;
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;

        anArray = new int[10];
        anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // and so forth

        System.out.println(anArray);
        System.out.println(anArray[0]);
        System.out.println(anArray.length);

        //sentencias de control


        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        //switch
        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);


        //bucles
        int count = 1;
              do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);


        for(int j=1;j<11; j++){
            System.out.println("Count is: " + j);
        }

        //POO

        Persona persona= new Persona();
        persona.setName("Eduardo");
        persona.setLastname("Medina");
        persona.setAge(35);

        System.out.println("Persona "+persona.toString());

    }

}
