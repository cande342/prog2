/* import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> lista;

    // Constructor
    public Pila() {
        lista = new ArrayList<>();
    }

    // Agregar un elemento a la cima de la pila
    public void push(T o) {
        lista.add(o);
    }

    // Retirar y retornar el elemento en la cima de la pila
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return lista.remove(lista.size() - 1);
    }

    // Retornar el elemento en la cima de la pila sin eliminarlo
    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return lista.get(lista.size() - 1);
    }

    // Retornar la cantidad de elementos almacenados en la pila
    public int size() {
        return lista.size();
    }

    // Retornar una nueva pila con una copia de los elementos
    public Pila<T> copy() {
        Pila<T> copia = new Pila<>();
        for (T item : lista) {
            copia.push(item);
        }
        return copia;
    }

    // Retornar una nueva pila con los elementos en el orden inverso
    public Pila<T> reverse() {
        Pila<T> reversa = new Pila<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            reversa.push(lista.get(i));
        }
        return reversa;
    }

    // Método auxiliar para verificar si la pila está vacía
    private boolean isEmpty() {
        return lista.isEmpty();
    }
}
*/