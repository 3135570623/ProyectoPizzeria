// Clase Pizza
// Representa el objeto que será guardado dentro de la pila

public class Pizza {

    // Nombre de la pizza
    String nombre;

    // Arreglo de tamaño fijo para 3 ingredientes
    String[] ingredientes;

    // Constructor que recibe el nombre y los ingredientes
    public Pizza(String nombre, String[] ingredientes) {

        // Guardamos el nombre
        this.nombre = nombre;

        // Creamos el arreglo de tamaño fijo
        this.ingredientes = new String[3];

        // Copiamos los ingredientes al arreglo
        for (int i = 0; i < 3; i++) {
            this.ingredientes[i] = ingredientes[i];
        }
    }

    // Método para mostrar la pizza en consola
    public void mostrarPizza() {

        System.out.println("Pizza: " + nombre);
        System.out.println("Ingredientes:");

        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println("- " + ingredientes[i]);
        }
    }
}