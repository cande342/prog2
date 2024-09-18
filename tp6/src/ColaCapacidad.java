//Los que tienen mas capacidad, van a ir primero en la cola.
public class ColaCapacidad extends ColaCarga {
    public boolean compare(TransporteDeCarga t1, TransporteDeCarga t2){
        return t1.getCapacidad()> t2.getCapacidad();
    }
}
