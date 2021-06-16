package persona;

import java.util.Date;


public class Persona
{

	private String nombre;
	private String apellido;
	private int dni;
	private char sexo;
	private Date fechaNacimiento;
	
	
	public Persona()
	{
		
		this.nombre = null;
		this.apellido = null;
		this.dni = 0;
		this.sexo = 0;
		this.fechaNacimiento = null;
	}	
	
	
	public Persona(String nombre, String apellido, int dni, char sexo, Date fechaNacimiento)
	{
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNombre() 
	{
		return nombre;
	}


	public String getApellido()
	{
		return apellido;
	}


	public int getDni() 
	{
		return dni;
	}


	public char getSexo() 
	{
		return sexo;
	}


	public Date getFechaNacimiento() 
	{
		return fechaNacimiento;
	}	
	
	
	
	
	
	
}
