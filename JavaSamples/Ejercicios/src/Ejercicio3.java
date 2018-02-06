/**
 * Created by pjohnson on 5/02/18.
 */
public class Ejercicio3 {

    public boolean esPalindromo(String palabra) {
        for (int i = 0; i < palabra.length() - i; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
