package Classes;

public class mostrar_estudiante {
	
	public void mostrarEstudiantes(String nombre) {
		
		agregarEstudiantes();
		
		for(int i=0; i <= Estudiantes.legth; i++) {
			if(nombre == Estudiantes[i]){
				return Estudiante[i];
			} 
		}
	}
}
