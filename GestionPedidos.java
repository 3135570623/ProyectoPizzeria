// Clase que controla las dos pilas

public class GestionPedidos {

    // Pila principal
    Pila undo;

    // Pila secundaria
    Pila redo;

    // Constructor
    public GestionPedidos() {

        undo = new Pila();
        redo = new Pila();
    }

    // Registrar pizza
    public void registrarPizza(Pizza pizza) {

        undo.push(pizza);

        // Cuando se registra algo nuevo se limpia redo
        redo = new Pila();

        System.out.println("Pizza registrada");
    }

    // Deshacer pedido
    public void deshacer() {

        if (undo.isEmpty()) {
            System.out.println("No hay pedidos para deshacer");
            return;
        }

        Pizza pizza = undo.pop();
        redo.push(pizza);

        System.out.println("Pedido deshecho");
    }

    // Rehacer pedido
    public void rehacer() {

        if (redo.isEmpty()) {
            System.out.println("No hay pedidos para rehacer");
            return;
        }

        Pizza pizza = redo.pop();
        undo.push(pizza);

        System.out.println("Pedido rehecho");
    }

    // Mostrar pedido actual
    public void mostrarActual() {

        Pizza pizza = undo.peek();

        if (pizza != null) {
            pizza.mostrarPizza();
        }
    }
}