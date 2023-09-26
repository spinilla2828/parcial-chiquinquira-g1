package Classes;

import java.util.ArrayList;
import java.util.List;

public class AgregarEstudiante {
	private List<Estudiantes> listaEstudiantes = new ArrayList<>();
	
	public void AgregarEstudiantes(String nombre, int edad, List<String> asignaturas)
	{
		Estudiantes estudiante = new Estudiantes(nombre, edad, asignaturas);
        listaEstudiantes.add(estudiante);
        System.out.println("Estudiante agregado con éxito.");
	}
	
	public List<Estudiantes> getListaEstudiantes()
	{
		return listaEstudiantes;
	}
}
