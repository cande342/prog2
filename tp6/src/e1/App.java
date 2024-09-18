
/* package e1;
public class App {
    public static void main(String[] args) {

        Alquilador alquilador = new Alquilador();


        Inventario inventario = alquilador.getInventario();

    
        Pelicula peli1 = new Pelicula("Chiquen Little", "Comedia familiar");
        Pelicula peli2 = new Pelicula("Armagedon", "Ciencia ficción");
        Pelicula peli3 = new Pelicula("Orgullo y Prejuicio", "Drama romántico");
        Pelicula peli4 = new Pelicula("Oppenheimer", "Histórico");


        Vehiculo moto = new Vehiculo("Kawasaki", 0, 1231, "Diesel");
        Vehiculo auto1 = new Vehiculo("Fiat", 240.00, 435, "Nafta");


        Cliente cliente1 = new Cliente("Marcos");
        Cliente cliente2 = new Cliente("Camila");
        Cliente cliente3 = new Cliente("Marcela");


        inventario.aniadirPelicula(peli1, 10);
        inventario.aniadirPelicula(peli2, 5);
        inventario.aniadirPelicula(peli3, 1);
        inventario.aniadirPelicula(peli4, 2);
        inventario.aniadirVehiculo(moto);
        inventario.aniadirVehiculo(auto1);


        alquilador.aniadirCliente(cliente1);
        alquilador.aniadirCliente(cliente2);
        alquilador.aniadirCliente(cliente3);


        alquilador.alquilarPelicula(peli1, 7, cliente2);
        alquilador.alquilarPelicula(peli2, 7, cliente2);
        alquilador.alquilarPelicula(peli3, 7, cliente2);
        alquilador.alquilarPelicula(peli4, 7, cliente2);
        alquilador.alquilarVehiculo(moto, 3, cliente3);
        alquilador.alquilarVehiculo(auto1, 7, cliente1);

        alquilador.mostrarItemsCliente();
    }
}
*/