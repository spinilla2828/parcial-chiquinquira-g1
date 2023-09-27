package Classes;

public class MostrarEstudiante {
	
	public void mostrar_estudiantes(List<Estudiantes> listaEstudiantes) {
		
		if(listaEstudiantes.isEmpy()){
			System.out.println("No hay estudiantes Registrados");
		}
		else {
			System.out.println("Lista de estudiantes:");
			
			for(Estudiantes estudiante: listaEstudiantes){
				System.out.println("Nombre Estudiante: "+estudiante.getNombre());
				System.out.println("Edad Estudiante: "+estudiante.getEdad());
				System.out.println("Asignaturas Estudiante: "+estudiante.getAsignaturas());
			}
		}
	}
}
