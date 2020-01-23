package FigurasGeometricas;

public class Triangulo extends FiguraGeometrica{
	
	public float altura;
	
	

	public Triangulo(float base, float altura) {
		super(base);
		this.altura = altura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getArea() {
		return (getBase() * getAltura()) / 2;
	}
	
	public int getCantLados() {
		return 3;
	}
	
}
