## Fundamentos del lenguaje Java
 
 1. Comentarios
 
 ```java
  a. /** 
      * Tipo Comentario 1
      **/
  b. /* Tipo Comentario 2 */
  c. // Tipo Comentario 3
 ```
 
 2. Ejemplo Hola Mundo
 
 ```java
 /** 
  * La clase HelloWorld mplementa una aplicacion que solamete imprime "Hello World"
  * en la salida estandar
  */
 class HelloWorldApp {
     public static void main(String[] args) {
         System.out.println("Hello World!"); // Muestra el String.
     }
 }
 ```
 
 3. Variables
 
 ```java
 int edad = 21;
 float velocidad = 45.5f;
 double temperatura = 23.5;
 boolean estaCorriendo = true;
 long milisegundos = 10929239101023L;
 char letra = 'C';
 String oracion = "Este es el ejemplo de una oracion en Java";
 ```
 
 4. Tipos de datos primitivos
 
  * byte (0): ocupa  8 bits
  * short (0): ocupa 16 bits
  * int (0): ocupa 32 bits
  * long (0): ocupa 64 bits
  * float (0.0f): ocupa 32 bits
  * double (0.0): ocupa 64 bits
  * boolean (false): ocupa 1 bit
  * char ('\u0000'): ocupa 16 bits
  
 5. Samples

  ```java
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
  ```
  
 6. Operadores
 
 <img src = "https://github.com/TeclaLabsPeruTraining/Java-Fundamentals-GMD/blob/Lesson1/images/java-operators.png" />
  
 7. Arreglos

  ```java
     // declarar un arreglo de enteros
    int[] anArray;
    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;
  ```

  ```java
    // crear un array de enteros
    anArray = new int[10];
    anArray[0] = 100; // initialize first element
    anArray[1] = 200; // initialize second element
    anArray[2] = 300; // and so forth
  ```

  ```java
    int[] anArray = { 
        100, 200, 300,
        400, 500, 600, 
        700, 800, 900, 1000
    };
  ```
  
 8. Control de flujo

 ```java
  class IfElseDemo {
      public static void main(String[] args) {

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
      }
  }
  
 ```

 ```java
  public class SwitchDemo {
    public static void main(String[] args) {

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
    }
}
 ```

 ```java
  class DoWhileDemo {
      public static void main(String[] args){
          int count = 1;
          do {
              System.out.println("Count is: " + count);
              count++;
          } while (count < 11);
      }
  }
 ```

 ```java
  class ForDemo {
      public static void main(String[] args){
           for(int i=1; i<11; i++){
                System.out.println("Count is: " + i);
           }
      }
  }
 ```
  
 9. Exercises

 - https://leetcode.com/problems/reverse-string
 - https://leetcode.com/problems/maximum-depth-of-binary-tree
 - https://leetcode.com/problems/invert-binary-tree
 - https://leetcode.com/problems/sum-of-left-leaves

 
## Referencias 

 - http://docs.oracle.com/javase/tutorial/index.html
 - https://google.github.io/styleguide/javaguide.html
 - https://www.compilejava.net/
 - https://www.edx.org/course/java-fundamentals-android-development-galileox-caad001x
 - https://leetcode.com/
