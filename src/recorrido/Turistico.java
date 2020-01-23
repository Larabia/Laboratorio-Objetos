package recorrido;

public class Turistico extends Recorrido{
	
	

	private String nombre;


	public Turistico(String origen, String destino, float precio, String nombre) {
		super(origen, destino, precio);
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() { 
		return  super.toString() + "\n"  + "Nombre: " + nombre ; 
	}

}
