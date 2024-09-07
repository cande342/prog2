/* package tp2_control;
import java.util.ArrayList;
import java.util.List;

public class Ciudad {

    private String nombre;
    private List<Impuestos> impuestos;
    private int gastosMantenimiento;
    private int poblacion;

    public Ciudad (){
        this.impuestos = new ArrayList<>();
        this.gastosMantenimiento = 500000;
        this.poblacion = 100000;
    }

    public Ciudad(String nombre, int gastosMantenimiento, int poblacion){
        this.nombre=nombre;
        this.impuestos = new ArrayList<>();
        this.gastosMantenimiento = gastosMantenimiento;
        this.poblacion = poblacion;
    }

    public void aniadirImpuestos(Impuestos impuesto){
        this.impuestos.add(impuesto);
    }

    public double totalImpuestos(){
        double totalRecaudado = 0;
        for(Impuestos imp : impuestos){
            totalRecaudado += imp.getMonto();
        }
        return totalRecaudado;
    }
    
    public boolean enDeficit() {
        double totalRecaudado = totalImpuestos();
        return getGastosMantenimiento() > totalRecaudado;
    }

        // Getter para gastosMantenimiento
        public int getGastosMantenimiento() {
            return gastosMantenimiento;
        }
    
        // Setter para gastosMantenimiento
        public void setGastosMantenimiento(int gastosMantenimiento) {
            this.gastosMantenimiento = gastosMantenimiento;
        }
    
        // Getter para poblacion
        public int getPoblacion() {
            return poblacion;
        }
    
        // Setter para poblacion
        public void setPoblacion(int poblacion) {
            this.poblacion = poblacion;
        }

            // Getter para impuestos
    public List<Impuestos> getImpuestos() {
        return impuestos;
    }

    // Setter para impuestos
    public void setImpuestos(List<Impuestos> impuestos) {
        this.impuestos = impuestos;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
    this.nombre = nombre;
}


    @Override
    public String toString() {
        String result = "Nombre de la ciudad: " + nombre + "\n";
        result += "Cantidad de impuestos: " + impuestos.size() + "\n";
        result += "Detalles de impuestos:\n";

        for (Impuestos imp : impuestos) {
            result += "  - " + imp.getNombre() + ": " + imp.getMonto() + "\n";
        }

        result += "Población total: " + poblacion + "\n";
        result += "Gastos de mantenimiento: " + gastosMantenimiento;

        return result;
    }
}

*/