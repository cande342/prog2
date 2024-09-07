/* package tp2_control;
import java.util.ArrayList;
import java.util.List;



public class Pais {
    
    private String nombre;
    private List<Provincia> provincias;
    private final int cantidadProvincias = 3;
    private int totalPoblacion = 100000;


    public Pais() {
        this.nombre = "Mi País";
        this.provincias = new ArrayList<>(cantidadProvincias);

    }

    public void agregarProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }
    
    public List<Ciudad> obtenerCiudadesEnDeficit() {
        List<Ciudad> ciudadesEnDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            ciudadesEnDeficit.addAll(provincia.ciudadesEnDeficit());
        }
        return ciudadesEnDeficit;
    }

    public void imprimirCiudadesEnDeficit() {
        for (Provincia provincia : provincias) {
            int conteo = provincia.contarCiudadesEnDeficitConPoblacionMayorA(totalPoblacion);
            System.out.println("Provincia: " + provincia.getNombre() + " tiene " + conteo + " ciudades en déficit con más de 100,000 habitantes.");
        }
    }
    
    
}
*/