package datos;

public class Prestacion 
{
	
	private int codigo;
	private String descripcion;
	private float costo;
	
	
	
public Prestacion() 
{
		
		this.codigo = 0;
		this.descripcion = null;
		this.costo = 0;
	}
	
	
	
	public Prestacion(int codigo, String descripcion, float costo)
	{
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.costo = costo;
	}



	public int getCodigo() 
	{
		return codigo;
	}



	public String getDescripcion() 
	{
		return descripcion;
	}



	public float getCosto() 
	{
		return costo;
	}



	public void setCosto(float costo)
	{		//solo set de costo por si cambia
		this.costo = costo;
	}
	
	
	
	
	
	

}
