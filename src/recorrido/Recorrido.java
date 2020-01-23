package recorrido;

public class Recorrido {
	
	private String origen;
	private String destino;
	private float precio;
	

	public Recorrido(String origen, String destino, float precio) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String toString() { 
		return "origen: " + origen  + "\n" + "destino: " + destino + "\n" + "precio: " + precio;
		}
	
	

	
	

	

	

}

