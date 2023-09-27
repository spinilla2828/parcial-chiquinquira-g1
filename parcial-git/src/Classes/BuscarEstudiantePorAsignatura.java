package Classes;

import java.util.List;

public class BuscarEstudiantePorAsignatura {

	//funcion que recibe parametros de lista de estudiantes y la asignatura a buscar
	public void buscarEstudiantePorAsignatura(List<Estudiantes> listaEstudiantes, String asignatura) {
		
		//impreción del titulo de la lista
		System.out.println("Lista de estudiantes de la asignatura: "+asignatura);
		
		//contador de estudiantes
		int cantidad = 0;
		
		//ciclo de repeticion foreach 
		for( Estudiantes estudiante: listaEstudiantes) {
			
			//creacion de lisa para las asignaturas
			List<String> asignaturaEstudiantes = estudiante.getAsignatura();
			
			//Condicion para validar que el estudiante este en la asignatura
			if(asignaturaEstudiantes.contains(asignatura)) {
				
				//salida por terminal
				System.out.println("nombre Estudiante: "+ estudiante.getNombre());
				
				//aumento en la cantidad de estudiantes de la asignatura
				cantidad++;
			}
		}
		
		//Condicio para validar si no hay ningn estudiante 
		if(cantidad == 0) {
			System.out.println("No hay estudiantes en en esta asignatura");
		}
	}
}
