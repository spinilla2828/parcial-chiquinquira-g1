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
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	public List<String> getAsignaturas() {
        return asignaturas;
    }
	
	public void setAsignaturas(List<String> asignaturas)
	{
		this.asignaturas = asignaturas;
	}
}
