package datos;

import java.util.HashSet;



public class ObraSocial 
{
	
	private String nombre;	//nombre de la obra social en si
	private float cobertura; // % que cubre la obra social	
	private HashSet<Prestacion> practicasCubiertas;	//que practicas cubre la obra social
	
	
	
	public ObraSocial()
	{
		
		this.nombre = null;
		this.cobertura = 0;
		this.practicasCubiertas = new HashSet<>();
	}
	
	
	
	public ObraSocial(String nombre, float cobertura, HashSet<Prestacion> practicasCubiertas) 
	{
		
		this.nombre = nombre;
		this.cobertura = cobertura;
		this.practicasCubiertas = practicasCubiertas;			// VER ESTO  clase aparte??
	}



	public String getNombre()
	{
		return nombre;
	}



	public float getCobertura() 
	{
		return cobertura;
	}



	public HashSet<Prestacion> getPracticasCubiertas() 
	{				//ver lo de la lista
		return practicasCubiertas;
	}



	public void setCobertura(float cobertura) 
	{		//ver si queremos la opcion de cambiarla
		this.cobertura = cobertura;
	}



	public void setPracticasCubiertas(HashSet<Prestacion> practicasCubiertas) 
	{		//ver lo de la lista
		this.practicasCubiertas = practicasCubiertas;
	}

	
	
	
	
	
	
	
	
}
