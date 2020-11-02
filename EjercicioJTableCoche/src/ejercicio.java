import java.util.ArrayList;

public class ejercicio {
	
	
	public static ArrayList<Coche> crearArray() {
		ArrayList<Coche> listaCoches = new ArrayList<>();
		Coche c1 = new Coche("Seat", "no me se ninguno", "rojo", "23432f", 1998);
		Coche c2 = new Coche("Mercedes", "no me se ninguno", "azul", "23432f", 1998);
		listaCoches.add(c1);
		listaCoches.add(c2);
		return listaCoches;
	}
}
