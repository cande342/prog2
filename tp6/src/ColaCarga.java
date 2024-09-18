//La responsabilidad de la cola de carga es ordenar los transportes:por fecha, los que se cargaron antes, se vacian primero.
// O sea, entraron primero : salen primero.
import java.util.ArrayList;

public abstract class ColaCarga {

    protected  ArrayList<TransporteDeCarga> transportes;

    public void agregarTransporte(TransporteDeCarga e){
        int lugar = 0;
        while (transportes.size()> 0 && this.compare(transportes.get(lugar),e)){
                lugar++;
        }
        if (lugar<transportes.size()) {
			transportes.add(lugar, e);
		} else {
			transportes.add(e);
		}

    }
    
    public abstract boolean compare(TransporteDeCarga t1, TransporteDeCarga t2);

    public TransporteDeCarga returnFirst(){
        return transportes.get(0);
    }

    public void quitar(){
        transportes.remove(0);
    }
	public boolean tieneTransportes() {
		return transportes.size()>0;
	}
}
