
import java.util.ArrayList;

public class Casa {

    protected String nombre;
    protected ArrayList<String> cualidadesCasa;
    protected ArrayList<Alumno> alumnos;
    protected final int MAXALUMNOS = 20;
    protected Casa enemistad;


    public Casa(String nombre, ArrayList<String> cualidades, Casa enemistad){
        this.nombre = nombre;
        this.cualidadesCasa = new ArrayList<>(cualidades);
        this.alumnos = new ArrayList<>();
        this.enemistad = enemistad;
    }

    public String getNombre(){
        return nombre;
    }
    public ArrayList<String> getCualidadesCasa(){
        return cualidadesCasa;
    }

    protected boolean hayEnemistad(AlumnoIngresante e){
        if (enemistad == null) {
            return false;  // No hay enemistad, podemos continuar
        }
        // Comprobar si el alumno tiene cualidades que lo califiquen para la casa enemiga
        return enemistad.compararCualidades(e);
    }

    protected boolean compararCualidades(AlumnoIngresante e){
        // Verificar si el alumno tiene todas las cualidades que requiere la casa
        return e.getCualidades().containsAll(this.cualidadesCasa);
    }

    public void aniadirAlumno(AlumnoIngresante e){
        if (alumnos.size() < MAXALUMNOS && compararCualidades(e) && !hayEnemistad(e)) {
            alumnos.add(e);
            System.out.println("Se añadió a la casa: " + this.getNombre());
        } else {
            System.out.println("No se puede añadir a la casa: " + this.getNombre());
        }
    }

    public void aniadirCualidad(String cualidad) {
        this.cualidadesCasa.add(cualidad);
    }
    

    public void setEnemistad(Casa e){
        this.enemistad = e;
    }

    public Casa getEnemistad(){
        return this.enemistad;
    }


}
