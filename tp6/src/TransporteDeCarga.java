
import java.time.LocalDate;

public class TransporteDeCarga {
    private String tipo;
    private LocalDate fechaDeCarga;
    private double capacidad;

    public TransporteDeCarga(String tipo, LocalDate fechaDeCarga, double capacidad){
        this.tipo = tipo;
        this.fechaDeCarga = fechaDeCarga;
        this.capacidad = capacidad;
    }


    public LocalDate getFechaDeCarga(){
        return this.fechaDeCarga;
    }

    public double getCapacidad(){
        return this.capacidad;
    }
}
