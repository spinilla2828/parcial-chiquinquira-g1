package Classes;

import java.util.List;

public class BuscarEstudiante {
	public void BuscarEstudiantePorNombre(List<Estudiantes> listaEstudiantes, String nombreBuscar) {
        boolean encontrado = false;
        for(Estudiantes estudiante : listaEstudiantes){
        	if (estudiante.getNombre().equalsIgnoreCase(nombreBuscar)) {
        		System.out.println("Nombre: "+estudiante.getNombre());
        		System.out.println("Edad: "+estudiante.getEdad());
        		System.out.println("Asignatura: "+estudiante.getAsignatura());
        		encontrado = true;
        		break;
        	}
        }
        if(!encontrado) {
        	System.out.println("No se encontro el estudiante");
        }
	}
}