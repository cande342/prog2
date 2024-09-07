package tp2_canchas;

import java.time.LocalDate;

public class Prueba {

    public static void main(String[] args) {
        // Crear usuarios
        Usuario juan = new Usuario("Juan");
        Usuario maria = new Usuario("Maria");

        // Crear turnos para los usuarios
        Turno turno1 = new Turno(400, juan, LocalDate.of(2024, 6, 1));
        Turno turno2 = new Turno(400, juan, LocalDate.of(2024, 6, 15));
        Turno turno3 = new Turno(100, maria, LocalDate.of(2024, 6, 10));
        Turno turno4 = new Turno(100, maria, LocalDate.of(2024, 7, 15));
        Turno turno5 = new Turno(100, maria, LocalDate.of(2024, 6, 20));
        Turno turno6 = new Turno(100, maria, LocalDate.of(2024, 7, 25));
        Turno turno7 = new Turno(100, maria, LocalDate.of(2024, 7, 1));

        // Añadir turnos a los usuarios
        juan.aniadirTurno(turno1);
        juan.aniadirTurno(turno2);

        maria.aniadirTurno(turno3);
        maria.aniadirTurno(turno4);
        maria.aniadirTurno(turno5);
        maria.aniadirTurno(turno6);
        maria.aniadirTurno(turno7);

        // Verificar si los usuarios son socios
        System.out.println("Turnos Juan: " + juan.getCantidadTurnos()); // Debería imprimir false
        System.out.println("Turnos Maria:" + maria.getCantidadTurnos()); // Debería imprimir false
        
        System.err.println("María es socio? " + maria.isEsSocio());
        
        turno1.mostrarInformacion();
        turno5.mostrarInformacion();

        
    }
}
