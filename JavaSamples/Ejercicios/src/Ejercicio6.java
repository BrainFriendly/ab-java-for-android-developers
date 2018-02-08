/**
 * Created by pjohnson on 7/02/18.
 */
public class Ejercicio6 {

    int[] arreglo;

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        int x1 = 0;
        int x2 = 1;
        int rpta = 0;
        while (n > 1) {
            rpta = x1 + x2;
            int temp = x1 + x2;
            x1 = x2;
            x2 = temp;
            n--;
        }
        return rpta;
    }

    public int fibRec(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (arreglo[n-1] > 0) {
            return arreglo[n];
        }
        int x = fib(n - 1) + fib(n - 2);
        arreglo[n-1] = x;
        return x;
    }



    public int fibRec2(int n) {
        arreglo = new int[n];
        return fibRec(n);
    }
}
