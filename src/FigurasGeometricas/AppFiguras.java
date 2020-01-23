package FigurasGeometricas;

import java.util.Scanner;

public class AppFiguras {

	public static void main(String[] args) {
		System.out.println("Calculadora de area");
		System.out.println("===================");
		System.out.println("Seleccione la figura que desea calcular: 1. Triangulo| 2.Cuadrado| 3.Rectangulo");
		Scanner sc = new Scanner(System.in);
		int tipoFig = sc.nextInt();

		switch (tipoFig) {
		case 1: {
			System.out.println("Ingrese base: ");
			float tBase = sc.nextFloat();
			System.out.println("Ingrese altura: ");
			float tAltura = sc.nextFloat();
			Triangulo t = new Triangulo(tBase, tAltura);
			System.out.println("El area del triangulo es :" + t.getBase());
		}
		case 2: {
			System.out.println("Ingrese base: ");
			float cBase = sc.nextFloat();
			Cuadrado c = new Cuadrado(cBase);
			System.out.println("El area del cuadrado es :" + c.getBase());
		}
		case 3: {
			System.out.println("Ingrese base: ");
			float rBase = sc.nextFloat();
			System.out.println("Ingrese altura: ");
			float rAltura = sc.nextFloat();
			Rectangulo r = new Rectangulo(rBase, rAltura);
			System.out.println("El area del rectangulo es :" + r.getBase());

		}

		default:
			System.out.println("Seleccione la figura que desea calcular: 1. Triangulo| 2.Cuadrado| 3.Rectangulo");
			tipoFig = sc.nextInt();
		}
	}

}
