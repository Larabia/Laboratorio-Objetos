package FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica{

	
	public float altura;

	public Rectangulo(float base, float altura) {
		super(base);
		this.altura= altura;
		// TODO Auto-generated constructor stub
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getArea() {
		return getBase() * getAltura();
	}

	@Override
	public int cantLados() {
		// TODO Auto-generated method stub
		return 4;
	}
	

}
