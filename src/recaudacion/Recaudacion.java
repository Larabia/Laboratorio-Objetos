package recaudacion;

public class Recaudacion {

	private float efectivo;
	private float tarjeta;
	
	public Recaudacion(float efe, float tar) {
		efectivo = efe;
		tarjeta = tar;
	}

	public float getEfectivo() {
		return efectivo;
	}

	public void setEfectivo(float efectivo) {
		this.efectivo = efectivo;
	}

	public float getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(float tarjeta) {
		this.tarjeta = tarjeta;
	}

}
