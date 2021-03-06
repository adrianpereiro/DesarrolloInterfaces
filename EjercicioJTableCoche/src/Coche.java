
public class Coche {
	@Override
	public String toString() {
		return marca ;
	}

	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private int aņoFabricacion;
	
	public Coche(String marca, String modelo, String color, String matricula, int aņoFabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.aņoFabricacion = aņoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAņoFabricacion() {
		return aņoFabricacion;
	}

	public void setAņoFabricacion(int aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
	}
	
}
