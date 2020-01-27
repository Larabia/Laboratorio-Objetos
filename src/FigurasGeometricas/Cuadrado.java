package FigurasGeometricas;

public class Cuadrado extends FiguraGeometrica{
	
	
	public Cuadrado(float base) {
		super(base);
		// TODO Auto-generated constructor stub
	}

	public float getArea() {
		return getBase() * getBase();
	}
	

	@Override
	public int cantLados() {
		// TODO Auto-generated method stub
		return 4;
	}

}
