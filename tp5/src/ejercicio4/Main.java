import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear familiares para un alumno ingresante
        ArrayList<AlumnoIngresado> familiaresDeJuan = new ArrayList<>();
        AlumnoIngresado hermanoDeJuan = new AlumnoIngresado("Carlos Pérez", new ArrayList<>(), "Slytherin");
        familiaresDeJuan.add(hermanoDeJuan);

        ArrayList<AlumnoIngresado> familiaresDeMaria = new ArrayList<>();
        
        // Crear las cualidades de los alumnos
        ArrayList<String> cualidadesJuan = new ArrayList<>();
        cualidadesJuan.add("Ambicioso");
        cualidadesJuan.add("Astuto");

        ArrayList<String> cualidadesMaria = new ArrayList<>();
        cualidadesMaria.add("Valiente");
        cualidadesMaria.add("Leal");
        
        // Crear alumnos ingresantes
        AlumnoIngresante juanPerez = new AlumnoIngresante("Juan Pérez", cualidadesJuan, familiaresDeJuan);
        AlumnoIngresante mariaGomez = new AlumnoIngresante("Maria Gomez", cualidadesMaria, familiaresDeMaria);
        
        // Crear las cualidades de la casa Slytherin
        ArrayList<String> cualidadesSlytherin = new ArrayList<>();
        cualidadesSlytherin.add("Ambicioso");
        cualidadesSlytherin.add("Astuto");

        // Crear las cualidades de la casa Gryffindor
        ArrayList<String> cualidadesGryffindor = new ArrayList<>();
        cualidadesGryffindor.add("Valiente");
        cualidadesGryffindor.add("Leal");
        
        // Crear la casa Slytherin y Gryffindor (enemistad)
        Casa gryffindor = new Casa("Gryffindor", cualidadesGryffindor, null);
        CasaPura slytherin = new CasaPura("Slytherin", cualidadesSlytherin, null);
                
        // Establecer enemistades
        slytherin.setEnemistad(gryffindor);
        gryffindor.setEnemistad(slytherin);
        
        // Añadir alumnos a las casas
        gryffindor.aniadirAlumno(mariaGomez);
        slytherin.aniadirAlumno(juanPerez);
    }
}

