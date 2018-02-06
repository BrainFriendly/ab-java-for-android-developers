/**
 * Created by pjohnson on 5/02/18.
 */
public class Ejercicio1 {

    public int obtenerSigloDeAno(int ano) {
        int siglo = ano / 100;
        if (ano % 100 > 0) {
            siglo++;
        }
        return siglo;
    }
}
