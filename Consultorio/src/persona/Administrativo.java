package persona;

import java.util.Date;

public class Administrativo extends Staff
{
	
	private String area;	// secretaria , contable , etc

		
	public Administrativo() 
	{
		super();
		this.area = null;
	}
	
	
	
	public Administrativo(String nombre, String apellido, int dni, char sexo, Date fechaNacimiento, int cargaHoraria, String turno, float sueldo, String area) 
	{
		super(nombre, apellido, dni, sexo, fechaNacimiento, cargaHoraria, turno, sueldo);
		this.area = area;
	}



	public String getArea()
	{
		return area;
	}

	
	
	
	
	
	
	
	
}
