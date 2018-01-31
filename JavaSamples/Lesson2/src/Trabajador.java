/**
 * Created by pjohnson on 31/01/18.
 */
public abstract class Trabajador extends Persona {

    private String id;
    private String tutorName;

    public Trabajador(String nombre) {
        super(nombre);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public abstract String trabajar();
}
