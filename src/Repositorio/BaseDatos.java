package Repositorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BaseDatos {
	
	private Connection conexion;
	private String ip;
	private String puerto;
	private String nombreUsuario;
	private String pass;
	private String nombreBase;
	private int cantTuplas;
	
	public BaseDatos() {
		super();
		this.setIp("192.168.153.134");
		this.setPuerto("3306");
		this.setNombreUsuario("eclipse");
		this.setPass ("eclipse");
		this.setNombreBase("Seguros");
	}
	public BaseDatos(String usuario,String pass,String base)
	{
		this.setNombreBase(base);
		this.setNombreBase(usuario);
		this.setPass(pass);
	}
	protected int getCantTuplas() {
		return cantTuplas;
	}
	private void setCantTuplas(int cantTuplas) {
		this.cantTuplas = cantTuplas;
	}
	
	private Connection getConexion() {
		return conexion;
	}

	private void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	private String getIp() {
		return ip;
	}

	private void setIp(String ip) {
		this.ip = ip;
	}

	private String getPuerto() {
		return puerto;
	}

	private void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	private String getNombreUsuario() {
		return nombreUsuario;
	}

	private void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	private String getPass() {
		return pass;
	}

	private void setPass(String pass) {
		this.pass = pass;
	}

	private String getNombreBase() {
		return nombreBase;
	}

	private void setNombreBase(String nombreBase) {
		this.nombreBase = nombreBase;
	}

	

/**
 * Metodo que se conecta con la BD
 * @return
 */

	protected boolean conectarse(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection laconexion = DriverManager.getConnection("jdbc:mysql://"
					+this.getIp()+":"
					+this.getPuerto()+"/"
					+this.getNombreBase(),
					this.getNombreUsuario(),
					this.getPass());
			this.setConexion(laconexion);
			System.out.println("Cargando...");
			return true;
		}catch(Exception e){
			//e.printStackTrace();
			return false;
		}	
	}
	
	/**
	 * Metodo que se desconecta de la BD
	 * @return
	 */
	
	protected boolean desconectarse(){
	try{
			this.getConexion().close();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * Metodo que ejecuta la sentencia SQL recibida por parametro (INSERT, UPDATE, DELETE)
	 * retorna verdadero si el SQL se ejecuto con exito 
	 *  y falso en caso contrario
	 * @param sentencia
	 * @return boolean
	 */
	
	protected boolean ejecutarSQL(String sentencia){
		
		try {
			Statement stmt = this.getConexion().createStatement();
			stmt.executeUpdate(sentencia);	
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}		
	}
	
	
	/**
	 *  Metodo que ejecuta la sentencia SQL (SELECT)  recibida por parametro 
	 *  y retorna el resultado en un Resulset, que contiene los registros del resultado de la ejecucion SELECT
	 * @param sentencia
	 * @return
	 */
	protected ResultSet ejecutarSelect(String sentencia){
		ResultSet rst = null;
		
		try {
			Statement stmt = this.getConexion().createStatement();
			rst = stmt.executeQuery(sentencia);	
			
			rst.last();
			this.setCantTuplas(rst.getRow());
			rst.first();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return rst;
	}

}
