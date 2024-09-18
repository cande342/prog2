/* package e1;
import java.time.LocalDate;

public class ItemAlquilado{

    protected String name;
    protected LocalDate fechaAlquilada;
    protected LocalDate fechaLimite;
    protected int duracionAlquiler;
    private int copiasDisp;
    
    public ItemAlquilado(Object name, LocalDate fechaAlquilada, int duracionAlquiler){
        this.name = name.toString();
        this.fechaAlquilada = fechaAlquilada;
        this.duracionAlquiler = duracionAlquiler;
        this.fechaLimite = fechaAlquilada.plusDays(duracionAlquiler);
        System.out.println("El item: " + name + "Se alquiló con éxito");
    }

    public int getCopiasDisp(){
        return this.copiasDisp;
    }

    public LocalDate getFechaAlquilada(){
        return fechaAlquilada;
    }

    public LocalDate getFechaLimite(){
        return fechaLimite;
    }

    public void setFechaAlquilada(LocalDate e){
        this.fechaAlquilada = e;
    }

    public void setFechaLimite(LocalDate e){
        this.fechaLimite= e;
    }

    public String toString(){
        return this.name + " alquilado hasta " + getFechaLimite();
    }

} */
