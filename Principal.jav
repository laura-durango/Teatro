import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos met = new Metodos();

        System.out.print("Ingrese número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Ingrese número de columnas: ");
        int columnas = sc.nextInt();

        // 🔹 Matriz vacía
        ObjPunto4[][] teatro = new ObjPunto4[filas][columnas];

        // Crear y llenar
        teatro = met.CrearMatriz(teatro);

        System.out.println("\n--- MATRIZ ORIGINAL ---");
        met.Mostrar(teatro);

        // Ordenar
        teatro = met.OrdenarPorPrecio(teatro);

        System.out.println("\n--- MATRIZ ORDENADA POR PRECIO (ASCENDENTE) ---");
        met.Mostrar(teatro);
    }
}