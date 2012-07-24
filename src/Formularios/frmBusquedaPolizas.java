package Formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmBusquedaPolizas extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBusquedaPolizas frame = new frmBusquedaPolizas();
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
	public frmBusquedaPolizas() {
		setBounds(100, 100, 450, 300);

	}

}
