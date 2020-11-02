import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class Tabla {

	private JFrame frame;
	private JTable tbCoches;
	private JComboBox<Coche> cbCoches;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla window = new Tabla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tabla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 501, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane spCoches = new JScrollPane();
		
		
		tbCoches = new JTable();
		tbCoches.setModel(new CocheTableModel(ejercicio.crearArray()));
		tbCoches.setFillsViewportHeight(true);
		tbCoches.setAutoCreateRowSorter(true);
		spCoches.setViewportView(tbCoches);
		frame.getContentPane().add(spCoches);
		
		cbCoches = new JComboBox<Coche>();
		cbCoches.setModel(new DefaultComboBoxModel<Coche>(ejercicio.crearArray().toArray(new Coche[0])));
		spCoches.setRowHeaderView(cbCoches);
		
		
	}
}
