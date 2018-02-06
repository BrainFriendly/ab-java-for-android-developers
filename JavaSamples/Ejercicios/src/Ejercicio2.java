/**
 * Created by pjohnson on 5/02/18.
 */
public class Ejercicio2 {

    public int obtenerMayorNota(int[] notas) {
        if (notas == null) {
            System.out.println("No se puede iterar un arreglo nulo");
            return -1;
        }
        int maxIndex = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[maxIndex] < notas[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
