package datos;

import java.util.Date;
import java.util.HashMap;

import persona.Paciente;


public class HistoriaClinica 
{
	
	private int numero;	//dni del paciente
	private Paciente elPaciente;	//datos del paciente
	private HashMap<Date, Prestacion> practicasRealizadas; //tratamientos que se realizo
	
	
	public HistoriaClinica()
	{		
		this.numero = 0;
		this.elPaciente = null;
		this.practicasRealizadas = new HashMap<>();
	}
	
	
	
	public HistoriaClinica(int numero, Paciente elPaciente, HashMap<Date, Prestacion> practicasRealizadas)
	{		
		this.numero = numero;
		this.elPaciente = elPaciente;
		this.practicasRealizadas = practicasRealizadas;													//ver esto
	}



	public int getNumero() 
	{
		return numero;
	}


	public Paciente getElPaciente() 
	{
		return elPaciente;
	}


	public HashMap<Date, Prestacion> getPracticasRealizadas() 
	{
		return practicasRealizadas;
	}



	public void setPracticasRealizadas(HashMap<Date, Prestacion> practicasRealizadas) 
	{			//VER ESTO
		this.practicasRealizadas = practicasRealizadas;
	}

	
	
	
	
}
