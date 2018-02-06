/**
 * Created by pjohnson on 5/02/18.
 */
public class Bonus {

    public int encontrarRepetido(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int pivot = numeros[i];
            for (int j = i + 1; j < numeros.length; j++) {
                if (pivot == numeros[j]) {
                    return pivot;
                }
            }
        }
        return -1;
    }


}
