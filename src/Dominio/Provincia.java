package Dominio;

public class Provincia {
	
	private int idProvincia;
	private String provincia;
	
	public int getIdProvincia()
	{
		return idProvincia;
	}
	public void setIdProvincia(int value)
	{
		idProvincia=value;
	}
	public String getProvincia()
	{
		return provincia;
	}
	public void setProvincia(String value)
	{
		provincia=value;
	}
	public Provincia(int id,String descripcion)
	{
		idProvincia=id;
		provincia=descripcion;
	}
	public String toString()
	{
		return provincia;
	}

}
