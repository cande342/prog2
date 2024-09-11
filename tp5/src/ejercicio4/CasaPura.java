import java.util.ArrayList;

public class CasaPura extends Casa {

    public CasaPura(String nombre, ArrayList<String> cualidades, Casa enemistad) {
        super(nombre, cualidades, enemistad);
    }

    public boolean esSangrePura(AlumnoIngresante e) {
        for (AlumnoIngresado familiar : e.getFamiliaresEnEscuela()) {
            if (this.getNombre().equals(familiar.getCasa())) {
                return true;  // Si al menos un familiar está en la misma casa, es sangre pura
            }
        }
        return false;  // Si no hay ningún familiar en la misma casa, no es sangre pura
    }

    @Override
    public void aniadirAlumno(AlumnoIngresante e) {
        if (alumnos.size() < MAXALUMNOS && compararCualidades(e) && !hayEnemistad(e) && esSangrePura(e)) {
            alumnos.add(e);
            System.out.println("Se añadió a la casa pura: " + this.getNombre());
        } else {
            System.out.println("No se puede añadir a la casa pura: " + this.getNombre());
        }
    }
}
