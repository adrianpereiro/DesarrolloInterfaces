import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.DefaultEditorKit;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;

public class Editor {

	private JFrame frame;
	boolean cambio = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor window = new Editor();
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
	public Editor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		JTextPane textPane = new JTextPane();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int res = JOptionPane.showConfirmDialog(null, "Cerrar?");
				if (res == JFileChooser.APPROVE_OPTION) {
					editorTexto.asegurarDatos(cambio, textPane);
					frame.dispose();
				}
			}
		});
		frame.setBounds(100, 100, 856, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textPane.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				cambio = true;

			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				cambio = true;
			}

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				cambio = true;

			}
		});
		textPane.setBounds(81, 52, 749, 427);
		frame.getContentPane().add(textPane);

		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 324, 41);
		frame.getContentPane().add(menuBar_1);

		JButton barraNuevo = new JButton("");
		barraNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorTexto.asegurarDatos(cambio, textPane);
				cambio = false;
				textPane.setText(null);

			}
		});
		menuBar_1.add(barraNuevo);
		barraNuevo.setToolTipText("Crear archivo");
		barraNuevo.setIcon(new ImageIcon(Editor.class.getResource("/Imagenes/iconoArchivoNuevo (2).png")));

		JButton barraGuardar = new JButton("");
		barraGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorTexto.guardarArchivo(textPane);
				cambio = false;
			}
		});
		menuBar_1.add(barraGuardar);
		barraGuardar.setToolTipText("Guardar archivo");
		barraGuardar.setIcon(new ImageIcon(Editor.class.getResource("/Imagenes/iconoGuardar.png")));

		JButton barraCortar = new JButton(new DefaultEditorKit.CutAction());
		barraCortar.setText("");
		menuBar_1.add(barraCortar);
		barraCortar.setToolTipText("Cortar");
		barraCortar.setIcon(new ImageIcon(Editor.class.getResource("/Imagenes/iconoCortar.png")));

		JButton barraCopiar = new JButton(new DefaultEditorKit.CopyAction());
		barraCopiar.setText("");
		barraCopiar.setToolTipText("Copiar");
		menuBar_1.add(barraCopiar);
		barraCopiar.setIcon(new ImageIcon(Editor.class.getResource("/Imagenes/iconoCopiar.png")));

		JButton barraPegar = new JButton(new DefaultEditorKit.PasteAction());
		barraPegar.setText("");
		menuBar_1.add(barraPegar);
		barraPegar.setIcon(new ImageIcon(Editor.class.getResource("/Imagenes/iconoPegar.png")));
		barraPegar.setToolTipText("Pegar");

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setValue(textPane.getFont().getSize());
		spinner_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int tamaño = (int) spinner_1.getValue();
				textPane.setFont(textPane.getFont().deriveFont((float) tamaño));
			}
		});

		spinner_1.setBounds(414, 11, 49, 20);
		frame.getContentPane().add(spinner_1);

		JLabel lblTamañoTexto = new JLabel("Tama\u00F1o texto");
		lblTamañoTexto.setBounds(334, 14, 78, 14);
		frame.getContentPane().add(lblTamañoTexto);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFicheros = new JMenu("Ficheros");
		menuBar.add(mnFicheros);

		JMenuItem mntmNuevoArchivo = new JMenuItem("Nuevo");
		mntmNuevoArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorTexto.asegurarDatos(cambio, textPane);
				cambio = false;
			}
		});
		mnFicheros.add(mntmNuevoArchivo);

		JMenuItem mntmAbrirArchivo = new JMenuItem("Abrir");
		mntmAbrirArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorTexto.asegurarDatos(cambio, textPane);
				cambio = false;
				editorTexto.abrirArchivo(textPane);
			}
		});
		mnFicheros.add(mntmAbrirArchivo);
		
		JMenuItem mntmGuardarArchivo = new JMenuItem("Guardar");
		mntmGuardarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorTexto.guardarArchivo(textPane);
				cambio = false;
			}
		});
		mnFicheros.add(mntmGuardarArchivo);

		JMenuItem mntmGuardarComo = new JMenuItem("Guardar como...");
		mnFicheros.add(mntmGuardarComo);

		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);

		JMenu mnSeleccionarFuente = new JMenu("Seleccionar fuente");
		mnEditar.add(mnSeleccionarFuente);

		JMenuItem fuenteTimesNewRoman = new JMenuItem("Times New Roman");
		fuenteTimesNewRoman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorTexto.cambiarFuente("Times New Roman", textPane);
			}
		});
		mnSeleccionarFuente.add(fuenteTimesNewRoman);

		JMenuItem fuenteComicSans = new JMenuItem("Comic Sans");
		fuenteComicSans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorTexto.cambiarFuente("Comic Sans MS", textPane);
			}
		});
		mnSeleccionarFuente.add(fuenteComicSans);

		JMenu mnT = new JMenu("Tama\u00F1o fuente");
		mnEditar.add(mnT);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
		mnT.add(spinner);

		JMenuItem mntmCopiar = new JMenuItem(new DefaultEditorKit.CopyAction());
		mntmCopiar.setText("Copiar");
		mnEditar.add(mntmCopiar);

		JMenuItem mntmCortar = new JMenuItem(new DefaultEditorKit.CutAction());
		mntmCortar.setText("Cortar");
		mntmCopiar.setText("Cortar");
		mnEditar.add(mntmCortar);

		JMenuItem mntmPegar = new JMenuItem(new DefaultEditorKit.PasteAction());
		mntmPegar.setText("Copiar");
		mntmCopiar.setText("Pegar");
		mnEditar.add(mntmPegar);
	}
}
