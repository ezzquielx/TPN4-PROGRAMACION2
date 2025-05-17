import java.util.Arrays;

class GestorCadenas {
    private String[] cadenas;

    public GestorCadenas(String[] cadenas) {
        this.cadenas = cadenas;
        ordenarCadenas();
    }

    private void ordenarCadenas() {
        Arrays.sort(cadenas);
    }

    public int buscarCadena(String cadena) {
        return Arrays.binarySearch(cadenas, cadena);
    }

    public void mostrarCadenas() {
        System.out.println("Cadenas ordenadas:");
        for (String cadena : cadenas) {
            System.out.println("- " + cadena);
        }
    }
}