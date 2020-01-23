package periodico;

import java.awt.Dimension;

public abstract class Vineta {
	
	protected String imagen;
	protected String link;
	protected String seccion; 
	protected String posicion;
	protected Dimension dimension;
	
	
	public Vineta(String imagen, String link, String seccion, String posicion, Dimension dimension) {
		super();
		this.imagen = imagen;
		this.link = link;
		this.seccion = seccion;
		this.posicion = posicion;
		this.dimension = dimension;
	}
	
	public abstract boolean esFacturable();
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

}

