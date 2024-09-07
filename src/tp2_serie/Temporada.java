/* public class Temporada {

    private Capitulo[] capitulos;
    private int cantidadCapitulos;

    public Temporada(){
        this.capitulos = new Capitulo[10];
        this.cantidadCapitulos = 0;
    }

    public Temporada(int cantidadCapitulos){
        this.cantidadCapitulos = cantidadCapitulos;
        this.capitulos = new Capitulo[cantidadCapitulos];
        for (int i = 0; i < capitulos.length; i++) {
            capitulos[i] = new Capitulo();
        }
    }

    // Añadir capítulo a la temporada
    public void aniadirCap(Capitulo cap){
        if (cantidadCapitulos < capitulos.length) {
            capitulos[cantidadCapitulos] = cap;
            cantidadCapitulos++; // Incrementar la cantidad de capítulos
        } else {
            System.out.println("No hay espacio para añadir más capítulos.");
        }
    }

    public int capitulosVistos(){
        int contador = 0;
        for(Capitulo cap : capitulos){
            if (cap != null && cap.getFlag() == true) {
                contador++;

            }
        }
        return contador;
    }

    //Obtener el promedio de calificaciones dadas para una temporada en particualr
    public double promedioCalifiTempo(){
        int contador = 0, valoracion = 0;
        for (Capitulo cap : capitulos){
            if (cap != null && cap.getFlag() == true) {
                contador++;
                valoracion += cap.getCalification();
            }
        }
        return contador > 0 ? (double) valoracion / contador : 0; // Evitar división por cero
    }

    public int getCantidadCapitulos(){
        return cantidadCapitulos;
    }

    //revisar, lo saue de chatgtp

        // Método para actualizar la calificación de un capítulo específico por su índice
        public void actualizarCalificacion(int indice, int calificacion) {
            if (indice >= 0 && indice < capitulos.length) {
                capitulos[indice].setCalification(calificacion);
                
            } else {
                System.out.println("Índice de capítulo no válido.");
            }
        }

} */
