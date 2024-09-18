public class ColaFechaDeCarga extends ColaCarga {
    public boolean compare(TransporteDeCarga t1, TransporteDeCarga t2){
        return t1.getFechaDeCarga().isAfter(t2.getFechaDeCarga());
    }
    
}
