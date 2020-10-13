import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class editorTexto extends Editor {
	
	public static void cambiarFuente(String nombreFuente, JTextPane texto) {
		Font fuente = new Font(nombreFuente, Font.PLAIN, 12);
		texto.setFont(fuente);
	}

	public static void guardarArchivo(JTextPane texto) {
		String ruta = "";
		String textoUsuario = texto.getText();
		JFileChooser guardar = new JFileChooser();
		
		int creado= 0;
		do {
			int returnValue = guardar.showSaveDialog(null);
			if (returnValue == JFileChooser.APPROVE_OPTION) {
				ruta = (guardar.getSelectedFile().getAbsolutePath());
				File f = new File(ruta);
				if(f.exists()) {
					JOptionPane.showMessageDialog(null, "No se creo el porque ya existe esa dirección", "Error al crear el fichero", JOptionPane.WARNING_MESSAGE);
				}else {
					try {
						f.createNewFile();
						copiarFichero(f,textoUsuario);
						JOptionPane.showMessageDialog(null, "Fichero creado correctamente");
						creado=1;
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}while(creado!=1);
	}
	
	public static void abrirArchivo(JTextPane texto) {
		String ruta = "";
		JFileChooser abrir = new JFileChooser();
		
		int creado = 0;
		do {
			int returnValue = abrir.showOpenDialog(null);
			if(returnValue == JFileChooser.APPROVE_OPTION) {
				ruta = (abrir.getSelectedFile().getAbsolutePath());
				File f = new File(ruta);
				copiarEnFichero(f,texto);
				creado = 1;
			}
		}while(creado!=1);
	}
	
	public static void copiarEnFichero(File f,JTextPane texto) {
		FileInputStream input = null;
		
		try {
			int a;
			String textoUsuario="";
			input = new FileInputStream(f); //abre un canal de conexion con el archivo del que copiar
			InputStreamReader lectura = new InputStreamReader(input,StandardCharsets.UTF_8);
			BufferedReader br= new BufferedReader(lectura); 
			while((a = br.read()) != -1) {
				char letra = (char) a;
				System.out.println(letra);
				textoUsuario = textoUsuario+letra;
			}
			texto.setText(textoUsuario);
			
			input.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void copiarFichero(File f, String textoUsuario) {
		FileOutputStream output = null;
		try {
			int a;
			output = new FileOutputStream(f); //abre un canal de conexion con el archivo en el que copiar 
			
			for(a = 0; a<textoUsuario.length(); a++) {
				char letra= textoUsuario.charAt(a);
				output.write(letra); 	//escribe en el archivo que conecta a traves del canal 'output', es decir f2
			}
			
			output.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
