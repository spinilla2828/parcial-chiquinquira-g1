package Classes;

import java.util.Scanner;

public class Menu {
    

    public void ejecutarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar estudiante.");
            System.out.println("2. Buscar estudiante.");
            System.out.println("3. Buscar estudiantes por asignatura.");
            System.out.println("4. Mostrar todos los estudiantes.");
            System.out.println("5. Salir del programa.");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Caso 1 agregar estudiante aquí
                    break;
                case 2:
                    // Caso 2 buscar estudiante aquí
                    break;
                case 3:
                    // Caso 3 buscar estudiantes por asignatura aquí
                    break;
                case 4:
                    // Caso 4 mostrar todos los estudiantes aquí
                    break;
                case 5:
                	// Caso 5 mostrar todos los estudiantes aquí
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}