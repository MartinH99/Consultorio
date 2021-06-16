package persona;

import java.util.Date;

public class Medico extends Staff
{

	private String matricula;		//matricula del medico que sera su id MP MN	matricula provincial o nacional
	private String especialidad; 	//area
	private int numeroConsultorio; //donde atiende
	
	
	
	public Medico()
	{
		super();
		this.matricula = null;
		this.especialidad = null;
		this.numeroConsultorio = 0;
	}
	
		
	public Medico(String nombre, String apellido, int dni, char sexo, Date fechaNacimiento, int cargaHoraria, String turno, float sueldo, String matricula, String especialidad, int numeroConsultorio) 
	{
		super(nombre, apellido, dni, sexo, fechaNacimiento, cargaHoraria, turno, sueldo);
		this.matricula = matricula;
		this.especialidad = especialidad;
		this.numeroConsultorio = numeroConsultorio;
	}


	public String getMatricula() 
	{
		return matricula;
	}


	public String getEspecialidad()
	{
		return especialidad;
	}


	public int getNumeroConsultorio()
	{
		return numeroConsultorio;
	}


	public void setNumeroConsultorio(int numeroConsultorio)
	{		//ver si lo vamos a usar
		this.numeroConsultorio = numeroConsultorio;
	}
	
	
	
	
	
	
	
}
