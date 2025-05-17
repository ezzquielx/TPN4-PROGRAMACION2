import java.util.Scanner;

public class CadenaBusqueda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántas cadenas deseas ingresar?: ");
        int cantidad = Integer.parseInt(entrada.nextLine());

        String[] cadenas = new String[cantidad];

        System.out.println("Por favor, ingresa las cadenas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            cadenas[i] = entrada.nextLine();
        }

        GestorCadenas gestorCadenas = new GestorCadenas(cadenas);
        gestorCadenas.mostrarCadenas();

        String continuar;
        do {
            System.out.print("Introduce la cadena que quieres buscar: ");
            String cadenaABuscar = entrada.nextLine();
            int indice = gestorCadenas.buscarCadena(cadenaABuscar);

            if (indice >= 0) {
                System.out.println("La cadena '" + cadenaABuscar + "' fue hallada en la posición " + indice + ".");
            } else {
                System.out.println("La cadena '" + cadenaABuscar + "' no se encontró en el arreglo.");
            }

            System.out.print("¿Deseas buscar otra cadena? (s/n): ");
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        entrada.close();
    }
}