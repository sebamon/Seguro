package Formularios;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.util.EventObject;

import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class frmAltaPolizas extends JInternalFrame {
	private JTable Encabezado;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAltaPolizas frame = new frmAltaPolizas();
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
	public frmAltaPolizas() {
		setClosable(true);
		setTitle("Seguros - Alta Polizas");
		setBounds(100, 100, 627, 433);
		
		
		//getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		Encabezado = new JTable(new Object[2][5],new String[]{"1","2","3","4","5"});
		//scrollPane.setColumnHeaderView(Encabezado);
		table = new JTable();
		//scrollPane.setViewportView(table);
		JScrollPane scrollPane = new JScrollPane(Encabezado);
		getContentPane().add(scrollPane);
		TableColumn tc=Encabezado.getColumn("1");
		tc.setCellEditor(new DefaultCellEditor(new JCheckBox()));
		scrollPane.setVisible(true);
		//Encabezado.setVisible(true);

		
		
	

	}

}
