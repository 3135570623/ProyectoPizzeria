// Clase Pila
// Implementa una pila usando lista ligada

public class Pila {

    // Nodo que representa el tope de la pila
    Nodo cima;

    // Constructor
    public Pila() {
        cima = null;
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return cima == null;
    }

    // Método push: insertar una pizza en la pila
    public void push(Pizza pizza) {

        // Crear nuevo nodo
        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta al antiguo tope
        nuevo.siguiente = cima;

        // El nuevo nodo se convierte en el nuevo tope
        cima = nuevo;
    }

    // Método pop: retirar el elemento del tope
    public Pizza pop() {

        // Si está vacía no se puede sacar nada
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }

        // Guardamos la pizza del tope
        Pizza pizza = cima.dato;

        // Movemos la cima al siguiente nodo
        cima = cima.siguiente;

        return pizza;
    }

    // Método peek: ver el tope sin eliminarlo
    public Pizza peek() {

        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }

        return cima.dato;
    }
}