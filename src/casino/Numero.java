package casino;

public class Numero {

		private int valor;
		private String color;
		private int contador;
		
		public Numero(int valor, String color) {
			this.valor = valor;
			this.color = color;
			this.contador = 0;
		}
		
		public Numero(int valor) {
			this.valor = valor;
			this.contador = 0;
		}
		
		public int getValor() {
			return valor;
		}
		public void setValor(int valor) {
			this.valor = valor;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getContador() {
			return contador;
		}
		public void setContador(int contador) {
			this.contador = contador;
		}
		
		public void acumular() {
			this.contador++;
		}
		
		public String toString() {
			return valor + " " + contador;
		}
		
		
	}


