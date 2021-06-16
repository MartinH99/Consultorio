package persona;

import java.util.Date;

import interfaces.IGenerarID;

import datos.ObraSocial;
import datos.HistoriaClinica;


public class Paciente extends Persona implements IGenerarID
{

	private String id;	// el dni obtenido de persona
	private long telefono; //long porque el int no aguanta hasta los reginoles
	private String direccion;	//calle +numero
	private ObraSocial laObraSocial;	//que obra social tiene
	private HistoriaClinica laHistoriaClinica;	//la historia clinica
	

	public Paciente() 
	{
		super();
		this.id = null;
		this.telefono = 0;
		this.direccion = null;
		this.laObraSocial = null;
		this.laHistoriaClinica = null;
	}
	
	
	
	public Paciente(String nombre, String apellido, int dni, char sexo, Date fechaNacimiento, long telefono, String direccion, ObraSocial laObraSocial,
			HistoriaClinica laHistoriaClinica)
	{
		super(nombre, apellido, dni, sexo, fechaNacimiento);
		this.id = null;
		this.telefono = telefono;
		this.direccion = direccion;
		this.laObraSocial = laObraSocial;
		this.laHistoriaClinica = laHistoriaClinica;
	}


	public String getId()
	{
		return id;
	}


	public void setId(String id)
	{		
		this.id = id;
	}



	public long getTelefono() 
	{
		return telefono;
	}


	public String getDireccion() 
	{
		return direccion;
	}


	public ObraSocial getLaObraSocial() 
	{
		return laObraSocial;
	}


	public HistoriaClinica getLaHistoriaClinica() 
	{
		return laHistoriaClinica;
	}


	
	
	
}
