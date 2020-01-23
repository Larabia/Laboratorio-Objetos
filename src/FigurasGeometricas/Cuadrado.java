package FigurasGeometricas;

public class Cuadrado extends FiguraGeometrica{
	
	
	public Cuadrado(float base) {
		super(base);
		// TODO Auto-generated constructor stub
	}

	public float getArea() {
		return getBase() * getBase();
	}
	
	public int getCantLados() {
		return 4;
	}

}
