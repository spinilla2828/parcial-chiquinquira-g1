//Definir en que paquete se encuentra
package Classes;

import java.util.List;

public class Estudiantes
{
	//Definir atributos
	private String nombre;
	private int edad;
	private List<String> asignaturas;
	
	//Constructor que servira para crear los estudiantes
	public Estudiantes(String nombre, int edad, List<String> asignaturas)
	{
		this.asignaturas = asignaturas;
		this.nombre = nombre;
		this.edad = edad;
	}
	//Metodo para obtener el nombre del estudiante
	public String getNombre()
	{
		return nombre;
	}
	//Metodo para establecer el nombre del estudiante
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	//Metodo para obtener la edad del estudiante
	public int getEdad()
	{
		return edad;
	}
	//Metodo para establecer la edad del estudiante
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	//Metodo para obtener la lista de asignaturas del estudiante
	public List<String> getAsignatura() {
        return asignaturas;
    }
	//Metodo para establecer la lista de asignaturas del estudiante
	public void setAsignatura(List<String> asignaturas)
	{
		this.asignaturas = asignaturas;
	}
}
