package periodico;

import java.awt.Dimension;

public class Articulo extends Vineta {
	
	private String autor;
	
	

	public Articulo(String imagen, String link, String seccion, String posicion, Dimension dimension, String autor) {
		super(imagen, link, seccion, posicion, dimension);
		this.autor = autor;
	}

	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public boolean esFacturable() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
