package Dominio;

public class Localidad {

	private int idLocalidad;
	private String localidad;
	private Provincia provincia;
	
	public int getIdLocalidad()
	{
		return idLocalidad;
	}
	public void setIdLocalidad(int value)
	{
		idLocalidad=value;
	}
	public String getLocalidad()
	{
		return localidad;
	}
	public void setLocalidad(String value)
	{
		localidad=value;
	}
	public Provincia getProvincia()
	{
		return provincia;
	}
	public void setProvincia(Provincia value)
	{
		provincia=value;
	}
	
	public Localidad(int id,String descripcion,Provincia p)
	{
		idLocalidad=id;
		localidad=descripcion;
		provincia=p;
	}
	public Localidad(int id,String descripcion)
	{
		idLocalidad=id;
		localidad=descripcion;
	}
	public String toString()
	{
		return localidad;
	}
}
