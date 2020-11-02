import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class AñadirCoche extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AñadirCoche dialog = new AñadirCoche();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AñadirCoche() {
		setBounds(100, 100, 383, 292);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 367, 220);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(119, 5, 178, 31);
			textField.setColumns(10);
			contentPanel.add(textField);
		}
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(119, 47, 178, 31);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 89, 178, 31);
		contentPanel.add(textField_2);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(5, 47, 78, 31);
		contentPanel.add(lblModelo);
		
		JLabel lblMarca_1 = new JLabel("Marca");
		lblMarca_1.setBounds(5, 5, 78, 31);
		contentPanel.add(lblMarca_1);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(5, 89, 78, 31);
		contentPanel.add(lblColor);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(5, 131, 78, 31);
		contentPanel.add(lblMatricula);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 131, 178, 31);
		contentPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(119, 173, 178, 31);
		contentPanel.add(textField_4);
		
		JLabel lblAñoFabricacion = new JLabel("A\u00F1o de Fabricacion");
		lblAñoFabricacion.setBounds(5, 173, 91, 31);
		contentPanel.add(lblAñoFabricacion);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 220, 367, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
