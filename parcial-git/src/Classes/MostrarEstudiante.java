package Classes;

import java.util.List;

public class MostrarEstudiante {
	
	//funcion que recibe parametros de lista de estudiantes 
	public void mostrar_estudiantes(List<Estudiantes> listaEstudiantes) {
		
		//condicion para validar si la lista esta vacia
		if(listaEstudiantes.isEmpty()){
			System.out.println("No hay estudiantes Registrados");
		}
		//en el caso de que no este vacia 
		else {
			//imprecion por pantalla para mostrar la lista 
			System.out.println("Lista de estudiantes:");
			
			//ciclo para recorrer la lista de los estuudiantes 
			for(Estudiantes estudiante: listaEstudiantes){
				
				//impreciones para mostrar informacion de los estudiantes
				System.out.println("Nombre Estudiante: "+estudiante.getNombre());
				System.out.println("Edad Estudiante: "+estudiante.getEdad());
				System.out.println("Asignaturas Estudiante: "+estudiante.getAsignatura());
			}
		}
	}
}
