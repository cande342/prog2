/* package e1;
import java.time.LocalDate;
import java.util.ArrayList;

public class Alquilador {

    private ArrayList<Cliente> clientes;
    protected ArrayList<ItemAlquilado> itemsAlquilados;
    private Inventario inventario;

    public Alquilador() {
        this.clientes = new ArrayList<>();
        this.itemsAlquilados = new ArrayList<>();
        this.inventario = new Inventario();
    }

    public void aniadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Inventario getInventario(){
        return this.inventario;
    }
    public void aniadirItemAlquilado(ItemAlquilado itemAlquilado) {
        itemsAlquilados.add(itemAlquilado);
    }

    public ArrayList<ItemAlquilado> getItemsAlquilados() {
        return itemsAlquilados;
    }

    public void alquilarPelicula(Pelicula pelicula, int maxdias, Cliente cliente) {
        if (inventario.alquilarPelicula(pelicula)) {
            ItemAlquilado itemAlquilado = new ItemAlquilado(pelicula.getNombre(), LocalDate.now(), maxdias);
            cliente.aniadirAlquiler(itemAlquilado);
            itemsAlquilados.add(itemAlquilado);
        } else {
            System.err.println("No se ha podido alquilar la película: " + pelicula.getNombre());
        }
    }

    public void alquilarVehiculo(Vehiculo vehiculo, int maxdias, Cliente cliente) {
        if (inventario.alquilarVehiculo(vehiculo)) {
            ItemAlquilado itemAlquilado = new ItemAlquilado(vehiculo.getPatente(), LocalDate.now(), maxdias);
            cliente.aniadirAlquiler(itemAlquilado);
            itemsAlquilados.add(itemAlquilado);
        } else {
            System.err.println("No se ha podido alquilar el vehículo: " + vehiculo.getPatente());
        }
    }

    public boolean alquilerVencido(Cliente cliente) {
        for (ItemAlquilado itemAlquilado : cliente.getAlquilados()) {
            if (itemAlquilado.getFechaLimite().isBefore(LocalDate.now())) {
                return true;
            }
        }
        return false;
    }

    public void mostrarItemsCliente() {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNombre());
            for (ItemAlquilado itemAlquilado : cliente.getAlquilados()) {
                System.out.println(itemAlquilado);
            }
            System.out.println();
        }
    }
}
*/