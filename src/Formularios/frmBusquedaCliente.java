package Formularios;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.table.TableColumn;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class frmBusquedaCliente extends JInternalFrame {
	private JTextField textField;
	private JComboBox comboBox;
	private Button button;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBusquedaCliente frame = new frmBusquedaCliente();
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
	public frmBusquedaCliente() {
		setClosable(true);
		setIconifiable(true);
		setBounds(100, 100, 638, 595);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(192, 192, 192));
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Busqueda");
		lblNewLabel.setBounds(10, 26, 79, 14);
		desktopPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(109, 23, 143, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(291, 23, 107, 20);
		desktopPane.add(comboBox);
		String[] Vector={"1","2","3","4","5"};
		
		button = new Button("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setValueAt("HOla", 0, 0);
			}
		});
		button.setBounds(21, 80, 70, 22);
		desktopPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 122, 597, 318);
		desktopPane.add(scrollPane);
		
		table = new JTable(new Object[10][5],Vector);
		scrollPane.add(table);
		scrollPane.setColumnHeaderView(table);

	}
}
