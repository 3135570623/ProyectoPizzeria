import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestionPedidos sistema = new GestionPedidos();

        int opcion;

        do {

            System.out.println("\n--- MENU PIZZERIA ---");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("Nombre de la pizza:");
                    String nombre = sc.nextLine();

                    String[] ingredientes = new String[3];

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Ingrediente " + (i + 1) + ":");
                        ingredientes[i] = sc.nextLine();
                    }

                    Pizza pizza = new Pizza(nombre, ingredientes);
                    sistema.registrarPizza(pizza);

                    break;

                case 2:
                    sistema.deshacer();
                    break;

                case 3:
                    sistema.rehacer();
                    break;

                case 4:
                    sistema.mostrarActual();
                    break;

            }

        } while (opcion != 0);

        sc.close();
    }
}