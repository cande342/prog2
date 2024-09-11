import java.util.ArrayList;

public class AlumnoIngresante extends Alumno {

    private boolean tieneCasa;

    private ArrayList<AlumnoIngresado> familiaresEnEscuela;

    public AlumnoIngresante (String nombre, ArrayList<String> cualidades, ArrayList<AlumnoIngresado> familiares){
        super(nombre, cualidades);
        this.familiaresEnEscuela = new ArrayList<>(familiares);
        this.tieneCasa = false;

    }

    public void setTieneCasa(){
        this.tieneCasa = true;
    }

    public ArrayList<AlumnoIngresado> getFamiliaresEnEscuela(){
        return familiaresEnEscuela;
    }

    public void aniadirFamiliar(AlumnoIngresado familiar) {
        this.familiaresEnEscuela.add(familiar);
    }
    

}



