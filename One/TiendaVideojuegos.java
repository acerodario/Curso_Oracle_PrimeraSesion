import java.util.Scanner;

public class TiendaVideojuegos {
    public static void main(String[] args) {
        String[][] videojuegos = new String[10][3]; // matriz de videojuegos
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- Tienda de Videojuegos ---");
            System.out.println("1. Agregar Videojuego");
            System.out.println("2. Editar Videojuego");
            System.out.println("3. Borrar Videojuego");
            System.out.println("4. Mostrar todos los Videojuegos");
            System.out.println("0. Salir");

            System.out.print("\nIngrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarVideojuego(videojuegos, scanner);
                    break;
                case 2:
                    editarVideojuego(videojuegos, scanner);
                    break;
                case 3:
                    borrarVideojuego(videojuegos, scanner);
                    break;
                case 4:
                    mostrarVideojuegos(videojuegos);
                    break;
                case 0:
                    System.out.println("¡Gracias por usar la tienda de videojuegos!");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
    }

    // Método para agregar un videojuego a la matriz
    public static void agregarVideojuego(String[][] videojuegos, Scanner scanner) {
        System.out.print("\nIngrese el nombre del videojuego: ");
        String nombre = scanner.next();

        System.out.print("Ingrese el precio del videojuego: ");
        String precio = scanner.next();

        System.out.print("Ingrese el estado del videojuego (activo/inactivo): ");
        String estado = scanner.next();

        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i][0] == null) { // si la fila está vacía
                videojuegos[i][0] = nombre;
                videojuegos[i][1] = precio;
                videojuegos[i][2] = estado;
                System.out.println("\nEl videojuego ha sido agregado exitosamente.");
                break;
            }
        }
    }

    // Método para editar un videojuego existente
    public static void editarVideojuego(String[][] videojuegos, Scanner scanner) {
        System.out.print("\nIngrese el nombre del videojuego que desea editar: ");
        String nombre = scanner.next();

        int indice = -1;

        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i][0] != null && videojuegos[i][0].equals(nombre)) { // si el videojuego se encuentra en la matriz
                indice = i;
                break;
            }
        }

        if (indice != -1) { // si el videojuego se encuentra en la matriz
            System.out.println("\n1. Editar nombre");
            System.out.println("2. Editar precio");
            System.out.println("3. Editar ");
            System.out.print("\nIngrese la opción que desea realizar: ");
            int opcion = scanner.nextInt();
    
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el nuevo nombre del videojuego: ");
                    String nuevoNombre = scanner.next();
                    videojuegos[indice][0] = nuevoNombre;
                    System.out.println("\nEl nombre del videojuego ha sido modificado exitosamente.");
                    break;
                case 2:
                    System.out.print("\nIngrese el nuevo precio del videojuego: ");
                    String nuevoPrecio = scanner.next();
                    videojuegos[indice][1] = nuevoPrecio;
                    System.out.println("\nEl precio del videojuego ha sido modificado exitosamente.");
                    break;
                case 3:
                    System.out.print("\nIngrese el nuevo estado del videojuego (activo/inactivo): ");
                    String nuevoEstado = scanner.next();
                    videojuegos[indice][2] = nuevoEstado;
                    System.out.println("\nEl estado del videojuego ha sido modificado exitosamente.");
                    break;
                case 0:
                    System.out.println("\nLa edición del videojuego ha sido cancelada.");
                    break;
                default:
                    System.out.println("\nOpción no válida, intente de nuevo.");
                    break;
            }
        } else {
            System.out.println("\nEl videojuego no se encuentra en la tienda.");
        }
    }
    
    // Método para borrar un videojuego existente
    public static void borrarVideojuego(String[][] videojuegos, Scanner scanner) {
        System.out.print("\nIngrese el nombre del videojuego que desea borrar: ");
        String nombre = scanner.next();
    
        int indice = -1;
    
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i][0] != null && videojuegos[i][0].equals(nombre)) { // si el videojuego se encuentra en la matriz
                indice = i;
                break;
            }
        }
    
        if (indice != -1) { // si el videojuego se encuentra en la matriz
            videojuegos[indice][0] = null;
            videojuegos[indice][1] = null;
            videojuegos[indice][2] = null;
            System.out.println("\nEl videojuego ha sido borrado exitosamente.");
        } else {
            System.out.println("\nEl videojuego no se encuentra en la tienda.");
        }
    }
    
    // Método para mostrar todos los videojuegos de la tienda
    public static void mostrarVideojuegos(String[][] videojuegos) {
        System.out.println("\n--- Todos los Videojuegos ---");
    
        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i][0] != null) { // si la fila no está vacía
                System.out.println("Nombre: " + videojuegos[i][0] + "\tPrecio: " + videojuegos[i][1] + "\tEstado: " + videojuegos[i][2]);
            }
        }
    }
}
    
