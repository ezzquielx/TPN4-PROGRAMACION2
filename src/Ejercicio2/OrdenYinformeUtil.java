import java.util.Arrays;

public class OrdenYinformeUtil {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void compararRendimiento() {
        System.out.println("\n==== Rendimiento ====");
        System.out.println("\nTamaño\t\tBubble Sort\tArrays.sort()");
        System.out.println("----------------------------------------");

        int[] tamaños = {150, 1500, 15000};

        for (int tamaño : tamaños) {
            int[] arr1 = new int[tamaño];
            for (int i = 0; i < tamaño; i++) {
                arr1[i] = tamaño - i;
            }
            int[] arr2 = Arrays.copyOf(arr1, tamaño);

            long inicioBubble = System.nanoTime();
            bubbleSort(arr1);
            long finBubble = System.nanoTime();
            long tiempoBubble = (finBubble - inicioBubble) / 1_000_000;

            long inicioJava = System.nanoTime();
            Arrays.sort(arr2);
            long finJava = System.nanoTime();
            long tiempoJava = (finJava - inicioJava) / 1_000_000;

            System.out.printf("%d\t\t%d ms\t\t%d ms\n", tamaño, tiempoBubble, tiempoJava);
        }

        System.out.println("\nAnálisis: Arrays.sort() es más eficiente que Bubble Sort, especialmente");
        System.out.println("para arreglos grandes, debido a su complejidad.");
    }
}