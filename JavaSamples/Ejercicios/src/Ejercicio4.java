/**
 * Created by pjohnson on 7/02/18.
 */
public class Ejercicio4 {

    public int obtenerSumarDelMayorProducto(int[] enteros) {
        int maxProducto = Integer.MIN_VALUE;
        int indiceMaxProducto = -1;
        for (int i = 0; i < enteros.length - 1; i++) {
            if (enteros[i] * enteros[i + 1] > maxProducto) {
                maxProducto = enteros[i] * enteros[i + 1];
                indiceMaxProducto = i;
            }
        }

        return enteros[indiceMaxProducto] + enteros[indiceMaxProducto + 1];
    }
}
