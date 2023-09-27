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
        BuscarEstudiante buscarEstudiante = new BuscarEstudiante();//crear instancia de buscar estudiante 
        BuscarEstudiantePorAsignatura buscarEstudianteAsignatura = new BuscarEstudiantePorAsignatura();//instancia de buscar por asignatura
        MostrarEstudiante mostrarEstudiante = new MostrarEstudiante();
        
        do {//opciones del menu
            System.out.println("\nMenu:");
            System.out.println("1. Agregar estudiante.");
            System.out.println("2. Buscar estudiante.");
            System.out.println("3. Buscar estudiantes por asignatura.");
            System.out.println("4. Mostrar todos los estudiantes.");
            System.out.println("5. Salir del programa.");
            System.out.print("Seleccione una opcion: ");
            
            //while para varidar la opcion
            while (!scanner.hasNextInt()) {
                System.out.println("\nOpcion no valida. Intente de nuevo.");
                System.out.print("Seleccione una opcion: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    // Caso 1 agregar estudiante aqui
                	System.out.print("\nIngrese el nombre del estudiante: ");//pide al usuario ingresar dato para validar
                    String nombre = scanner.nextLine();//se toma el dato
                    System.out.print("Ingrese la edad del estudiante: ");
                    //while para validar que la edad que ingrese sea numerica y valida
                    while (!scanner.hasNextInt()) {
                        System.out.println("Edad no valida. Intente de nuevo.");
                        System.out.print("Ingrese la edad del estudiante: ");
                        scanner.next();
                    }
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    List<String> asignaturas = new ArrayList<>();

                    System.out.print("Ingrese la cantidad de asignaturas en las que esta inscrito: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Numero de asignaturas no valido. Intente de nuevo.");
                        System.out.print("Ingrese la cantidad de asignaturas en las que esta inscrito: ");
                        scanner.next();
                    }
                    int numAsignaturas = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    for (int i = 0; i < numAsignaturas; i++) {
                        System.out.print("Ingrese el nombre de la asignatura #" + (i + 1) + ": ");
                        String asignatura = scanner.nextLine();
                        asignaturas.add(asignatura);
                    }

                    agregarEstudiante.AgregarEstudiantes(nombre, edad, asignaturas);
                    listaEstudiantes.add(new Estudiantes(nombre, edad, asignaturas));//agrega los datos y muestra la lista
                    break;
                case 2:
                    // Caso 2 buscar estudiante aqui
                	System.out.println("\nIngrese el nombre del estudiante: ");
                	String nombreBuscar = scanner.nextLine();
                	
                	buscarEstudiante.BuscarEstudiantePorNombre(listaEstudiantes, nombreBuscar);
                    break;
                case 3:
                    // Caso 3 buscar estudiantes por asignatura aqui
                	System.out.println("\nIngrese el nombre de la asignatura: ");
                	String asignatura = scanner.nextLine();
                	
                	buscarEstudianteAsignatura.buscarEstudiantePorAsignatura(listaEstudiantes, asignatura);
                    break;
                case 4:
                    // Caso 4 mostrar todos los estudiantes aqui
                	mostrarEstudiante.mostrar_estudiantes(listaEstudiantes);
                    break;
                case 5:
                	// Caso 5 mostrar todos los estudiantes aqui
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.\n");
            }
        }while(opcion != 5);
    }
}