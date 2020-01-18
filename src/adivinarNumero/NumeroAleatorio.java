package adivinarNumero;

public class NumeroAleatorio {
	
	private int numero;
	private int intentos;
	
	
	public NumeroAleatorio(int numero, int intentos) {
		this.numero = numero;
		this.intentos = 1;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getIntentos() {
		return intentos;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	public void acumularIntento() {
		intentos++;
	}

}
