//La responsabilidad del puerto es CARGAR los barcos segun el orden y DESCARGAR los camiones segun fecha
public class Puerto {
    private ColaCarga camiones;
    private ColaCarga barcos;

    public Puerto(){
        this.camiones = new ColaFechaDeCarga();
        this.barcos = new ColaCapacidad();
    }

    public TransporteDeCarga descargarCamion(){
        TransporteDeCarga e = camiones.returnFirst();
        camiones.quitar();
        return e;
    }

    public void cargarBarco(TransporteDeCarga e){
        barcos.agregarTransporte(e);
    }

}
