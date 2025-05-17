public class ManipuladorArreglos {

    public int calcularSuma(int[] arr) {
        int suma = 0;
        for (int elemento : arr) {
            suma += elemento;
        }
        return suma;
    }
    public int[] encontrarMaxMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[] {min, max};
    }
    public int[] invertirArreglo(int[] arr) {
        int[] resultado = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resultado[i] = arr[arr.length - 1 - i];
        }

        return resultado;
    }
    public void mostrarArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}