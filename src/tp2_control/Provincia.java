/* package tp2_control;
import java.util.ArrayList;
import java.util.List;

public class Provincia {

    private String nombre;
    private List<Ciudad> ciudades;
    private int cantidadCiudades;

    public Provincia(String nombre, int cantidadCiudades){
        this.nombre=nombre;
        this.cantidadCiudades=cantidadCiudades;
        this.ciudades = new ArrayList<>(cantidadCiudades);
    }

    public void agregarCiudad(Ciudad ciudad) {
        if (ciudades.size() < cantidadCiudades) {
            ciudades.add(ciudad);
        } else {
            System.out.println("No se pueden agregar más ciudades, límite alcanzado.");
        }
    }


    public List<Ciudad> ciudadesEnDeficit(){
        List<Ciudad> ciudadesEnDeficit = new ArrayList<>();
        for (Ciudad ciudad : ciudades) {
            if (ciudad.enDeficit()) {
                ciudadesEnDeficit.add(ciudad);
            }
        }
        return ciudadesEnDeficit;
    }

    public int contarCiudadesEnDeficitConPoblacionMayorA(int poblacion) {
        int contador = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getPoblacion() > poblacion && ciudad.enDeficit()) {
                contador++;
            }
        }
        return contador;
    }


        // Getter para nombre
        public String getNombre() {
            return nombre;
        }
    
        // Setter para nombre
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        // Getter para cantidadCiudades
        public int getCantidadCiudades() {
            return cantidadCiudades;
        }
    
        // Setter para cantidadCiudades
        public void setCantidadCiudades(int cantidadCiudades) {
            this.cantidadCiudades = cantidadCiudades;
        }
    
        // Getter para ciudades
        public List<Ciudad> getCiudades() {
            return ciudades;
        }
    
        // Setter para ciudades
        public void setCiudades(List<Ciudad> ciudades) {
            this.ciudades = ciudades;
        }

        @Override
        public String toString() {
            String result = "Provincia: " + nombre + "\n" +
                            "Cantidad de Ciudades: " + cantidadCiudades + "\n" +
                            "Ciudades en Déficit:\n";

            for (Ciudad ciudad : ciudades) {
                if (ciudad.enDeficit()) {
                    result += "- " + ciudad.getNombre() + "\n";
                }
            }

            return result;
        }
}
*/