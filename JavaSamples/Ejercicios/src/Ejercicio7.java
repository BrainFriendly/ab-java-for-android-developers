/**
 * Created by pjohnson on 7/02/18.
 */
public class Ejercicio7 {

    public int bs(int[] arr, int x, int start, int end) {
        int pivot = (end + start) / 2;

        if (x == arr[pivot]) {
            return pivot;
        }
        if (x < arr[pivot]) {
            return bs(arr, x, start, pivot - 1);
        } else {
            return bs(arr, x, pivot + 1, end);
        }
    }
}
