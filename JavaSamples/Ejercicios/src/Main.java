/**
 * Created by pjohnson on 5/02/18.
 */
public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hola, Como te llamas?");
//        String nombre = scanner.next();
//        System.out.println("Hola " + nombre);

//        Ejercicio1 ejercicio1 = new Ejercicio1();
//        int siglo = ejercicio1.obtenerSigloDeAno(2018);
//        if (siglo == 21) {
//            System.out.println("Exito");
//        } else {
//            System.out.println("Error");
//        }

//        Ejercicio2 ejercicio2 = new Ejercicio2();
//        int[] notas = new int[]{-5,10,15,3,2,1};
//        int indiceMayor = ejercicio2.obtenerMayorNota(null);
//        if (indiceMayor == 2) {
//            System.out.println("Exito");
//        } else {
//            System.out.println("Error");
//        }
//
//        Ejercicio3 ejercicio3 = new Ejercicio3();
//        boolean esPalindromo = ejercicio3.esPalindromo("SOMOS");
//        System.out.print("Es Palindromo= " + esPalindromo);

        Bonus bonus = new Bonus();
        int repetido = bonus.encontrarRepetido(new int[]{1, 2, 3, 4, 4, 5});
        System.out.println(repetido);
    }
}
