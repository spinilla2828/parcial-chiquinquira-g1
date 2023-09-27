package Classes;

import java.util.List;

public class BuscarEstudiante {
	/**
     * Busca un estudiante por su nombre en la lista de estudiantes y muestra sus detalles si se encuentra.
     * 
     * @param listaEstudiantes La lista de estudiantes en la que se realizara la busqueda.
     * @param nombreBuscar     El nombre del estudiante que se busca.
     */
	public void BuscarEstudiantePorNombre(List<Estudiantes> listaEstudiantes, String nombreBuscar) {
        boolean encontrado = false;
       //Recorre la lista de estudiantes para buscar el estudiante por nombre
        for(Estudiantes estudiante : listaEstudiantes){
        	if (estudiante.getNombre().equalsIgnoreCase(nombreBuscar)) {
        		System.out.println("Nombre: "+estudiante.getNombre());
        		System.out.println("Edad: "+estudiante.getEdad());
        		System.out.println("Asignatura: "+estudiante.getAsignatura());
        		encontrado = true;
        		break;
        	}
        }
        //Si no se encuentra el estudiante, muestra un mensaje
        if(!encontrado) {
        	System.out.println("No se encontro el estudiante");
        }
	}
}