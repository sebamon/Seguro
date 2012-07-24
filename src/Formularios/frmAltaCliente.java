package Formularios;
import Servicio.*;
import Dominio.*;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Choice;
import javax.swing.JComboBox;



import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class frmAltaCliente extends JInternalFrame {
	private JTextField txtNombre=new JTextField();;
	private JTextField txtApellido=new JTextField();;
	private JTextField txtDireccion=new JTextField();;
	private JTextField txtTelefono=new JTextField();;
	private JTextField txtDni=new JTextField();;
	private JComboBox cboLocalidad = new JComboBox();
	private JComboBox cboProvincia=new JComboBox();
	private srv_Localidades srvLocal=new srv_Localidades();
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAltaCliente frame = new frmAltaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public frmAltaCliente() {
		try{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
			}catch(Exception e)
			{
				
			}
		setTitle("Seguros - Alta Cliente");
		
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 522, 220);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 11, 64, 14);
		desktopPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 36, 64, 14);
		desktopPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direccion: ");
		lblDireccion.setBounds(10, 61, 64, 14);
		desktopPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 86, 64, 14);
		desktopPane.add(lblTelefono);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 111, 64, 14);
		desktopPane.add(lblDni);
		
		
		txtNombre.setBounds(100, 8, 128, 20);
		desktopPane.add(txtNombre);
		txtNombre.setColumns(20);
	
		txtApellido.setBounds(100, 33, 128, 20);
		desktopPane.add(txtApellido);
		txtApellido.setColumns(20);
		
		txtDireccion.setBounds(100, 58, 128, 20);
		desktopPane.add(txtDireccion);
		txtDireccion.setColumns(20);
		
		txtTelefono.setBounds(100, 83, 128, 20);
		desktopPane.add(txtTelefono);
		txtTelefono.setColumns(20);
		
		txtDni.setBounds(100, 108, 128, 20);
		desktopPane.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(277, 11, 64, 14);
		desktopPane.add(lblProvincia);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(277, 36, 64, 14);
		desktopPane.add(lblLocalidad);
		CargarComboProvincia();
		cboProvincia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CargarComboLocalidad(((Provincia)cboProvincia.getSelectedItem()).getIdProvincia());
				
			}
		
		});
		cboProvincia.setBounds(353, 8, 141, 20);
		
		
		desktopPane.add(cboProvincia);
		
		
		cboLocalidad.setBounds(353, 33, 141, 20);
		desktopPane.add(cboLocalidad);
		
		Button btnAceptar = new Button("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente C =new Cliente(txtNombre.getText(),txtApellido.getText(),txtDni.getText(),txtDireccion.getText(),txtTelefono.getText());
				
			}
		});
		btnAceptar.setBounds(277, 103, 70, 22);
		desktopPane.add(btnAceptar);
		
		Button btnCancelar = new Button("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(424, 103, 70, 22);
		desktopPane.add(btnCancelar);
		
	}
	public void CargarComboLocalidad(int id)
	{
		Provincia P =(Provincia)cboProvincia.getSelectedItem();
		for(Object O : srvLocal.getLocalidades(P.getIdProvincia()))
		{		
		cboLocalidad.addItem((Localidad)O);
		}
	}
	public void CargarComboProvincia()
	{
		for(Object O : srvLocal.getProvincias())
		{
		cboProvincia.addItem((Provincia)O);
		}
		cboProvincia.setSelectedIndex(1);
	}
}
