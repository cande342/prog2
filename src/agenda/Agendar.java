/* package agenda;
import java.util.ArrayList;
import java.util.List;
    //Acá es donde debo chequear si los horarios se sobreponen para ver si agrego o no la reunion.
public class Agendar {

    private List<Reunion> reuniones; //Primero hacemos la lista de Reuniones, donde agregamos y eliminamos.


    public Agendar(){
        this.reuniones = new ArrayList<>();
    }

    public void agregarReunion(Reunion reunion){
        if(hayConflicto(reunion)){
            System.out.println("No se puede añadir la cita porque ya tienes ese horario ocupado");
        } else {
            this.reuniones.add(reunion);
            System.out.println("Se agendó con éxito");
        }
    }

    private boolean hayConflicto(Reunion reunion) {
        int contador = 0;
        for (Reunion reu : reuniones) {
            if (reu.getHoraIni().isBefore(reunion.getHoraFin()) && reunion.getHoraFin().isAfter(reu.getHoraIni())) {
                contador++;
            }
        }
        return contador > 0;
    }

}
 */