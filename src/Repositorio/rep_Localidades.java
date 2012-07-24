package Repositorio;

import Dominio.*;

import java.sql.ResultSet;
import java.util.ArrayList;

public class rep_Localidades 
{
	private BaseDatos conexion=new BaseDatos();
	
	public ArrayList getProvincias()
	{
		conexion.conectarse();
		String Sentencia="select idProvincia,Provincia from Provincias";
		ResultSet rst=conexion.ejecutarSelect(Sentencia);
		Provincia P;
		ArrayList Lista=new ArrayList();
		if(rst!=null)
		{
			try{
			rst.beforeFirst();
			while(rst.next())
			{
			P=new Provincia(rst.getInt("idProvincia"),rst.getString("Provincia"));
			Lista.add(P);
			}
			}catch(Exception e)
			{
				System.err.println("No se Encontro el Paciente");
			}
	}
		conexion.desconectarse();
		return Lista;
		}
	public ArrayList getLocalidades(int idProvincia)
	{
		conexion.conectarse();
		String Sentencia="select idLocalidad,Localidad,idProvincia from Localidades where idProvincia="+idProvincia;
		ResultSet rst=conexion.ejecutarSelect(Sentencia);
		Localidad L;
		ArrayList Lista=new ArrayList();
		if(rst!=null)
		{
			try{
			rst.beforeFirst();
			while(rst.next())
			{
			L=new Localidad(rst.getInt("idLocalidad"),rst.getString("Localidad"));
			Lista.add(L);
			}
			}catch(Exception e)
			{
				System.err.println("No se Encontro el Paciente");
			}
	}
		conexion.desconectarse();
		return Lista;
	}
		
}
