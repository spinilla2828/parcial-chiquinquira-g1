package Classes;

import java.util.List;

public class BuscarEstudiantePorAsignatura {

	public void buscarEstudiantePorAsignatura(List<Estudiantes> listaEstudiantes, String asignatura) {
		
		System.out.println("Lista de estudiantes de la asignatura: "+asignatura);
		
		int cantidad = 0;
		
		for( Estudiantes estudiante: listaEstudiantes) {
			List<String> asignaturaEstudiantes = estudiante.getAsignatura();
			if(asignaturaEstudiantes.contains(asignatura)) {
				System.out.println("mombre Estudiante: "+ estudiante.getNombre());
				cantidad++;
			}
		}
		
		if(cantidad == 0) {
			System.out.println("No hay estudiantes en en esta asignatura");
		}
	}
}
