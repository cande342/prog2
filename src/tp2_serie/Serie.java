/* public class Serie {

    private String title;
    private String description;
    private String genre;
    private String creator;
    private Temporada[] temporadas;
    private int cantidadTemporadas;

    public Serie(){
        this.temporadas = new Temporada[4];
        for (int i = 0; i < temporadas.length; i++) {
            temporadas[i] = new Temporada();
        }
    }

    public Serie( int cantidadTemporadas){
        this.cantidadTemporadas = cantidadTemporadas;
        this.temporadas = new Temporada[cantidadTemporadas];
        for (int i = 0; i < temporadas.length; i++) {
            temporadas[i] = new Temporada();
        }
    }

    public int totalEpisodios(){
        int contador = 0;
        for (Temporada temporada : temporadas) {
            contador += temporada.capitulosVistos();
        }
        
        return contador;
    }

    
    public int getTemporadas(){
        return cantidadTemporadas;
    }

    //Obtener el promedio de calificaciones para la serie
    
    //Determinar si se vio todos los capitulos de la serie
    public boolean vioTodaLaSerie(){
        boolean vio = true;
        for(Temporada tempo : temporadas){
            if (tempo.getCantidadCapitulos() != tempo.capitulosVistos()){
                vio = false;
            }
        }
        return vio;
    }

}*/