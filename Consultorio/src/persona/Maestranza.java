package persona;

import java.util.Date;

public class Maestranza extends Staff
{

	
	private String piso;	//en que piso trabaja	

	
	
	public Maestranza() 
	{
		super();
		this.piso = null;
	}
		
	
	public Maestranza(String nombre, String apellido, int dni, char sexo, Date fechaNacimiento, int cargaHoraria, String turno, float sueldo, String piso) 
	{
		super(nombre, apellido, dni, sexo, fechaNacimiento, cargaHoraria, turno, sueldo);
		this.piso = piso;
	}


	public String getPiso() 
	{
		return piso;
	}


	

	
	
		
	
	
	
	
}
