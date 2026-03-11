// Clase Nodo
// Representa cada elemento de la lista ligada

public class Nodo {

    // Guarda el objeto Pizza
    Pizza dato;

    // Apunta al siguiente nodo
    Nodo siguiente;

    // Constructor
    public Nodo(Pizza dato) {

        // Guardamos la pizza
        this.dato = dato;

        // Inicialmente no apunta a nada
        this.siguiente = null;
    }
}