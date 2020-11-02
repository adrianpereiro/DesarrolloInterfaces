import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CocheTableModel extends AbstractTableModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Coche> listaCoches = new ArrayList<>();
	private String[] columnas = {"Marca", "Modelo", "Color", "Matricula", "Año de fabricacion"};
	
	public CocheTableModel(ArrayList<Coche> coches) {
		super();
		listaCoches = coches;
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	public String getColumnName(int col) {
		return columnas[col];
	}
	
	@Override
	public int getColumnCount() {
		return columnas.length;
	}

	@Override
	public int getRowCount() {
		return listaCoches.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		if(row !=-1 && listaCoches.size() > row) {
			Coche coche = listaCoches.get(row);
			switch(col) {
			case 0:
				return coche.getMarca();
			case 1:
				return coche.getModelo();
			case 2:
				return coche.getColor();
			case 3:
				return coche.getMatricula();
			case 4:
				return coche.getAñoFabricacion();
			default:
				return null;
				}
			}else {
				return null;
		}	
	}

}
