import java.util.ArrayList;
import java.util.Collections;

public class MainOrdenamiento {

    public static void main(String[] args) {
        System.out.println("==== Ordenamiento ====");
        mostrarOrdenamientoProductos();
        OrdenYinformeUtil.compararRendimiento();
    }

    private static void mostrarOrdenamientoProductos() {

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Monitor IPS 160HZ", 180500, 15));
        productos.add(new Producto("Teclado Mecanico", 45000, 50));
        productos.add(new Producto("Mando Dualsense", 60000, 100));
        productos.add(new Producto("Cable Sata", 5000, 80));
        productos.add(new Producto("Disco SSD", 80000, 25));

        System.out.println("\n*** Productos ***");
        for (Producto p : productos) {
            System.out.println(p);
        }

        Collections.sort(productos);
        System.out.println("\n*** Ordenamiento Ascendente (por precio) ***");
        for (Producto p : productos) {
            System.out.println(p);
        }

        // Ordenar por nombre (Comparator)
        Collections.sort(productos, new ComparadorNombre());
        System.out.println("\n*** Ordenamiento según su nombre ***");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}