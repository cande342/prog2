package tp2_canchas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private List<Turno> turnos;
    private boolean esSocio;
    private int cantidadTurnos;
    private final int minimoTurnosSocios = 4;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.turnos = new ArrayList<>();
        this.esSocio = false;
    };

    public void aniadirTurno(Turno turno){
        this.turnos.add(turno);
        cantidadTurnos++;
        if (cantidadTurnos >= minimoTurnosSocios) {
            actualizarEstadoSocio();
        }
    };

    private void actualizarEstadoSocio() {
        LocalDate hoy = LocalDate.now();
        LocalDate dosMesesAtras = hoy.minus(2, ChronoUnit.MONTHS);

        int turnosEnRango = 0;
        for (Turno tur : turnos) {
            LocalDate fechaTurno = tur.getFecha();
            if (!fechaTurno.isBefore(dosMesesAtras) && !fechaTurno.isAfter(hoy)) {
                turnosEnRango++;
            }
        }

        esSocio = turnosEnRango >= minimoTurnosSocios;
    }



     // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para cantidadTurnos
    public int getCantidadTurnos() {
        return cantidadTurnos;
    }

    // Setter para cantidadTurnos
    public void setCantidadTurnos(int cantidadTurnos) {
        this.cantidadTurnos = cantidadTurnos;
    }

    // Getter para esSocio
    public boolean isEsSocio() {
        return esSocio;
    }

    // Setter para esSocio
    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }
}
