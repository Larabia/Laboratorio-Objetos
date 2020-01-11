package hojaDeRuta;

public class Ciudad {

	private String nombre;
	private int km;
	
	public Ciudad(String nombre, int km) {
		this.nombre = nombre;
		this.km = km;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

}

