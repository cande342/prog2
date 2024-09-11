/* package ejercicio1;
import java.time.LocalDate;

public class Planta {

    private String nombreCom;
    private String nombreCient;
    private String paisO;
    private LocalDate fechaC;
    private static int contador = 0;
    private final int id;

    public Planta(String nombreCom, String nombreCient, String paisO, LocalDate fechaC){
        this.nombreCom = nombreCom;
        this.nombreCient = nombreCient;
        this.paisO = paisO;
        this.fechaC = fechaC;
        this.id = ++contador;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + "\n" +
                "Planta: " + getNombreCom() + "\n";
    }

     // Getters
    public String getNombreCom() {
        return nombreCom;
    }

    public String getNombreCient() {
        return nombreCient;
    }

    public String getPaisO() {
        return paisO;
    }

    public LocalDate getFechaC() {
        return fechaC;
    }

    public int getId() {
        return id;
    }

    // Setters
    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public void setNombreCient(String nombreCient) {
        this.nombreCient = nombreCient;
    }

    public void setPaisO(String paisO) {
        this.paisO = paisO;
    }

    public void setFechaC(LocalDate fechaC) {
        this.fechaC = fechaC;
    }



}
*/