package periodico;

import java.awt.Dimension;

public class Publicidad extends Vineta{
	
	private String Auspiciante;
	private float precio;
	
	
	public Publicidad(String imagen, String link, String seccion, String posicion, Dimension dimension,
			String auspiciante, float precio) {
		super(imagen, link, seccion, posicion, dimension);
		Auspiciante = auspiciante;
		this.precio = precio;
	}
	
	
	public String getAuspiciante() {
		return Auspiciante;
	}
	public void setAuspiciante(String auspiciante) {
		Auspiciante = auspiciante;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public boolean esFacturable() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
