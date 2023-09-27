package Classes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public void ejecutarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        List<Estudiantes> listaEstudiantes = new ArrayList<>();
        AgregarEstudiante agregarEstudiante = new AgregarEstudiante(); // Crear instancia de AgregarEstudiante
        BuscarEstudiante buscarEstudiante = new BuscarEstudiante();
        BuscarEstudiantePorAsignatura buscarEstudianteAsignatura = new BuscarEstudiantePorAsignatura();
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar estudiante.");
            System.out.println("2. Buscar estudiante.");
            System.out.println("3. Buscar estudiantes por asignatura.");
            System.out.println("4. Mostrar todos los estudiantes.");
            System.out.println("5. Salir del programa.");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    // Caso 1 agregar estudiante aqui
                	System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    List<String> asignaturas = new ArrayList<>();

                    System.out.print("Ingrese la cantidad de asignaturas en las que esta inscrito: ");
                    int numAsignaturas = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    for (int i = 0; i < numAsignaturas; i++) {
                        System.out.print("Ingrese el nombre de la asignatura #" + (i + 1) + ": ");
                        String asignatura = scanner.nextLine();
                        asignaturas.add(asignatura);
                    }

                    agregarEstudiante.AgregarEstudiantes(nombre, edad, asignaturas);
                    listaEstudiantes.add(new Estudiantes(nombre, edad, asignaturas));
                    break;
                case 2:
                    // Caso 2 buscar estudiante aqui
                	System.out.println("Ingrese el nombre del estudiante: ");
                	String nombreBuscar = scanner.nextLine();
                	
                	buscarEstudiante.BuscarEstudiantePorNombre(listaEstudiantes, nombreBuscar);
                    break;
                case 3:
                    // Caso 3 buscar estudiantes por asignatura aqui
                	System.out.println("Ingrese el nombre de la asignatura: ");
                	String asignatura = scanner.nextLine();
                	
                	buscarEstudianteAsignatura.buscarEstudiantePorAsignatura(listaEstudiantes, asignatura);
                    break;
                case 4:
                    // Caso 4 mostrar todos los estudiantes aqui
                    break;
                case 5:
                	// Caso 5 mostrar todos los estudiantes aqui
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.\n");
            }
        }while(opcion != 5);
    }
}