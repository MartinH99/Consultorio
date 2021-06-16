package datos;

import java.util.HashMap;
import java.util.Date;

import interfaces.IListas;



public class ListaPrestacionesRealizadas implements IListas
{

	private HashMap<Date,Prestacion> mapaPrestaciones;
	
	public ListaPrestacionesRealizadas()
	{
			mapaPrestaciones = new HashMap<>();
	}

	@Override
	public void agregar(Date unaFecha, Prestacion unaPrestacion) //chequear parametros genericos para los ()
	{
		mapaPrestaciones.put(unaFecha, unaPrestacion);
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
