package Classes;

import java.util.ArrayList;
import java.util.List;

public class AgregarEstudiante {
	private List<Estudiantes> listaEstudiantes = new ArrayList<>();
	/**
     * Agrega un estudiante a la lista de estudiantes.
     * 
     * @param nombre      El nombre del estudiante.
     * @param edad        La edad del estudiante.
     * @param asignaturas La lista de asignaturas en las que el estudiante está inscrito.
     */
	public void AgregarEstudiantes(String nombre, int edad, List<String> asignaturas)
	{
		Estudiantes estudiante = new Estudiantes(nombre, edad, asignaturas);
        listaEstudiantes.add(estudiante);
        System.out.println("Estudiante agregado con exito.");
	}
	/**
     * Obtiene la lista de estudiantes almacenados.
     * 
     * @return La lista de estudiantes.
     */
	public List<Estudiantes> getListaEstudiantes()
	{
		return listaEstudiantes;
	}
}
