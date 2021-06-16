package persona;

import java.util.Date;

import interfaces.IGenerarID;

public class Staff extends Persona implements IGenerarID
{
		
	private String id;			 //matricula en caos de los medicos id mas dni en caso de los demas
	private int cargaHoraria;	//cuantas horas trabaja
	private String turno;		//mañana tarde noche
	private float sueldo;		//lo que cobra	
	
	
	
	public Staff() 
	{
		super();
		this.id = null;
		this.cargaHoraria = 0;
		this.turno = null;
		this.sueldo = 0;
	}	
	
		
	public Staff(String nombre, String apellido, int dni, char sexo, Date fechaNacimiento, int cargaHoraria, String turno, float sueldo) 
	{
		super(nombre, apellido, dni, sexo, fechaNacimiento);
		this.id = null;
		this.cargaHoraria = cargaHoraria;
		this.turno = turno;
		this.sueldo = sueldo;
	}


	public String getId() 
	{
		return id;
	}


	public void setId(String id) 
	{			//acomodar con interface
		this.id = id;
	}


	public int getCargaHoraria()
	{
		return cargaHoraria;
	}

	
	public String getTurno() 
	{
		return turno;
	}


	public void setTurno(String turno) 
	{
		this.turno = turno;
	}


	public float getSueldo() 
	{
		return sueldo;
	}


	public void setSueldo(float sueldo) 
	{
		this.sueldo = sueldo;
	}

	
	
	
}
