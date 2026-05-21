import java.util.Scanner;
 
public class Inventario {
 
    public static void main(String[] args) {
        ejecutarSistema();
    }
 
    public static void ejecutarSistema() {
        Scanner sc = new Scanner(System.in);
 
        int contadorProductos = 0;
        int totalUnidades = 0;
        boolean hayStockBajo = false;
        String opcion;
 
        do {
            System.out.println("Ingrese nombre del producto:");
            String nombre = sc.nextLine();
 
            System.out.println("Ingrese cantidad:");
            int cantidad = sc.nextInt();
            sc.nextLine(); // limpiar buffer
 
            contadorProductos++;
            totalUnidades += cantidad;
 
            if (cantidad < 10) {
                hayStockBajo = true;
            }
 
            System.out.println("¿Desea continuar? (S/N)");
            opcion = sc.nextLine();
 
        } while (!opcion.equalsIgnoreCase("N"));
 
        mostrarResultados(contadorProductos, totalUnidades, hayStockBajo);
    }
 
    public static void mostrarResultados(int contador, int total, boolean alerta) {
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Total de productos: " + contador);
        System.out.println("Total de unidades: " + total);
 
        if (alerta) {
            System.out.println("⚠ Hay productos con stock bajo");
        } else {
            System.out.println("Todo el stock está en buen nivel");
        }
    }
}
 