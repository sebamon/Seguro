package Dominio;

public class Cliente {
	
	private int idCliente;
	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private String telefono;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Cliente(String nom,String ape,String dni,String dir,String tel)
	{
		this.nombre=nom;
		this.apellido=ape;
		this.dni=dni;
		this.direccion=dir;
		this.telefono=tel;
	}
}
