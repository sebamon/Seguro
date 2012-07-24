package Servicio;
import java.util.ArrayList;

import Repositorio.*;
public class srv_Localidades {
	
	private rep_Localidades rep=new rep_Localidades();
	public ArrayList getProvincias()
	{		
		return rep.getProvincias();
	}
	public ArrayList getLocalidades(int idProv)
	{
		return rep.getLocalidades(idProv);
	}

}
