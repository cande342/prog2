package tp2_canchas;
import java.time.LocalDate;

public class Turno {

    private LocalDate fecha;
    private Usuario titular;
    private double descuento;
    private double precioCancha;

    public Turno (double precioCancha, Usuario titular){
        this.fecha = LocalDate.now();
        this.titular = titular;
        this.descuento = 0.10;
        this.precioCancha = precioCancha;
    };

    public Turno (double precioCancha, Usuario titular, LocalDate fecha){
        this.fecha = fecha;
        this.titular = titular;
        this.descuento = 0.10;
        this.precioCancha = precioCancha;
    };

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getTitular() {
        return titular;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double  getPrecioCancha() {
        return precioCancha;
    }

    public void setPrecioCancha(int precioCancha) {
        this.precioCancha = precioCancha;
    }

    public void aplicarDescuento(){
    if (titular.isEsSocio()) {
        precioCancha = precioCancha - (precioCancha * descuento);
        }
    else {
        System.out.println("No se puede aplicar descuento porque no es socio");
    }
        
    }

    public void mostrarInformacion() {
        aplicarDescuento();
        System.out.println("Fecha: " + fecha);
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Descuento aplicado: " + descuento * 100 + "%");
        System.out.println("Precio de la cancha: $" + precioCancha);
    }
}
