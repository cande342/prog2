/* package agenda;
import java.time.Duration;
import java.time.LocalDateTime;

public class Reunion {

    private String lugar;
    private User[] asistentes;
    private String tema;
    private LocalDateTime horaIni;
    private LocalDateTime horaFin;


    public Reunion(String lugar, User[] asistentes, String tema, LocalDateTime horaIni, LocalDateTime horaFin){
        this.lugar = lugar;
        this.asistentes = new User[4];
        this.tema = tema;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
    }

    public Duration getDuracion(){
        Duration duracion = Duration.between(horaIni, horaFin);
        return duracion;
    }

    public LocalDateTime getHoraIni(){
        return this.horaIni;
    }
    public LocalDateTime getHoraFin(){
        return this.horaFin;
    }
    public void setHoraIni(LocalDateTime horaIni){
        this.horaIni = horaIni;
    }

    public void setHoraFin(LocalDateTime horaFin){
        this.horaFin = horaFin;
    }

        // Getter y Setter para lugar
        public String getLugar() {
            return lugar;
        }
    
        public void setLugar(String lugar) {
            this.lugar = lugar;
        }
    
        // Getter y Setter para asistentes
        public User[] getAsistentes() {
            return asistentes;
        }
    
        // Método para mostrar los asistentes
        public void mostrarAsistentes() {
            if (asistentes != null && asistentes.length > 0) {
                for (User user : asistentes) {
                    System.out.println(user);
                }
            } else {
            System.out.println("No hay asistentes.");
            }
        }
        public void setAsistentes(User[] asistentes) {
            this.asistentes = asistentes;
        }
    
        // Getter y Setter para tema
        public String getTema() {
            return tema;
        }
    
        public void setTema(String tema) {
            this.tema = tema;
        }
    }

*/