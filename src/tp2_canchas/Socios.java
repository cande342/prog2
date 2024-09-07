package tp2_canchas;

import java.util.ArrayList;
import java.util.List;

public class Socios {

    private List<Usuario> listaSocios;
    private int cantidadSocios;

    public Socios(){
        this.listaSocios = new ArrayList<>();
        this.cantidadSocios = 10;
    }

    public void aniadirSocio(Usuario usuario){
        if(usuario.isEsSocio())
        this.listaSocios.add(usuario);
        cantidadSocios++;
    }

    public List<Usuario> getListaSocios(){
        return listaSocios;
    }
}
