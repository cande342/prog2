import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<String> cualidades;

    public Alumno(String nombre, ArrayList<String> cualidades){
        this.nombre=nombre;
        this.cualidades = new ArrayList<>(cualidades);
    }

    public ArrayList<String> getCualidades(){
        return cualidades;
    }

    public void aniadirCualidad(String cualidad) {
        this.cualidades.add(cualidad);
    }
    
}
