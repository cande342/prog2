
import java.util.ArrayList;

public class AlumnoIngresado extends Alumno {

    private String casa;

    public AlumnoIngresado(String nombre, ArrayList<String> cualidades, String casa){
        super(nombre, cualidades);
        this.casa=casa;
    }

    public String getCasa(){
        return casa;
    }
}
