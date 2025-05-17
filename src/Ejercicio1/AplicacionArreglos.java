
import java.util.Scanner;

public class AplicacionArreglos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManipuladorArreglos manipulador = new ManipuladorArreglos();
        System.out.println("=== MANIPULACIÓN DE ARREGLOS ===");
        System.out.print("Ingrese la cantidad de elementos: ");
        int tamaño = scanner.nextInt();

        if (tamaño <= 0) {
            System.out.println("Error: El tamaño del arreglo debe ser mayor que cero.");
            scanner.close();
            return;
        }
        int[] arreglo = new int[tamaño];

        System.out.println("\nIngrese los elementos del arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("\nArreglo original:");
        manipulador.mostrarArreglo(arreglo);

        int suma = manipulador.calcularSuma(arreglo);
        System.out.println("\nLa suma de los elementos es: " + suma);

        int[] extremos = manipulador.encontrarMaxMin(arreglo);
        System.out.println("El número mayor es: " + extremos[1]);
        System.out.println("El número menor es: " + extremos[0]);

        int[] arregloInvertido = manipulador.invertirArreglo(arreglo);
        System.out.println("\nArreglo invertido:");
        manipulador.mostrarArreglo(arregloInvertido);
    }
}