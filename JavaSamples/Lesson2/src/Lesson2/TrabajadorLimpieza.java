package Lesson2;

/**
 * Created by pjohnson on 31/01/18.
 */
public class TrabajadorLimpieza extends Trabajador {

    public TrabajadorLimpieza(String nombre) {
        super(nombre);
    }

    @Override
    public String trabajar() {
        return "Estoy limpiando!!";
    }
}
