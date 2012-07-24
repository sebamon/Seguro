package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Utilities;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
//Look and Feel
//Cell Editor

public class frmMenu extends JFrame {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu frame = new frmMenu();
					frame.setExtendedState(MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmMenu() {
		try{
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		SwingUtilities.updateComponentTreeUI(this);
		}catch(Exception e)
		{
			
		}
		setTitle(" Seguros - Menu Principal     ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 572);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		final JDesktopPane desktopPane = new JDesktopPane();
		JMenu menuClientes = new JMenu("Clientes");
		menuBar.add(menuClientes);
		
		JMenuItem mnuAltaCliente = new JMenuItem("Alta");
		mnuAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				frmAltaCliente frmNuevo=new frmAltaCliente();
				desktopPane.add(frmNuevo);
				frmNuevo.show();
			}
		});
		menuClientes.add(mnuAltaCliente);
		
		JMenuItem mnuBusquedaCliente = new JMenuItem("Busqueda");
		mnuBusquedaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBusquedaCliente frmNuevo=new frmBusquedaCliente();
				desktopPane.add(frmNuevo);
				frmNuevo.show();
			}
		});
		menuClientes.add(mnuBusquedaCliente);
		
		JMenu mnuPolizas = new JMenu("Polizas");
		menuBar.add(mnuPolizas);
		
		JMenuItem mnuAltaPolizas = new JMenuItem("Alta");
		mnuAltaPolizas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAltaPolizas frmNuevo=new frmAltaPolizas();
				desktopPane.add(frmNuevo);
				frmNuevo.show();
			}
		});
		mnuPolizas.add(mnuAltaPolizas);
		
		JMenuItem mnuConsultaPolizas = new JMenuItem("Consulta");
		mnuPolizas.add(mnuConsultaPolizas);
		
		
		desktopPane.setBackground(Color.WHITE);
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
		//Comentario
		JLabel label = new JLabel("");
		label.setBounds(24, 60, 46, 14);
		
		
		
	}
}
