/* package e1;
import java.util.ArrayList;

public class Inventario {

    private ArrayList<Pelicula> peliculas;
    private ArrayList<Integer> copiasPeliculas;
    private ArrayList<Vehiculo> vehiculos;

    public Inventario(){
        this.peliculas = new ArrayList<Pelicula>();
        this.vehiculos = new ArrayList<Vehiculo>();
        this.copiasPeliculas = new ArrayList<Integer>();
    };

    public void aniadirPelicula(Pelicula e, int copiasPeliculas){
        this.peliculas.add(e);
        this.copiasPeliculas.add(copiasPeliculas);
    };

    public void aniadirVehiculo(Vehiculo e){
        vehiculos.add(e);
    };


    public boolean alquilarPelicula(Pelicula pelicula) {
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).equals(pelicula) && copiasPeliculas.get(i) > 0) {
                copiasPeliculas.set(i, copiasPeliculas.get(i) - 1);
                return true;
            }
        }
        return false;
    }

    public void devolverPelicula(Pelicula pelicula) {
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).equals(pelicula)) {
                copiasPeliculas.set(i, copiasPeliculas.get(i) + 1);
            }
        }
    }

    public boolean alquilarVehiculo(Vehiculo vehiculo) {
        for (Vehiculo v : vehiculos) {
            if (v.equals(vehiculo) && v.isDisponible()) {
                v.setDisponible(false);
                return true;
            }
        }
        return false;
    }

    public void devolverVehiculo(Vehiculo vehiculo) {
        for (Vehiculo v : vehiculos) {
            if (v.equals(vehiculo)) {
                v.setDisponible(true);
            }
        }
    }


}
*/