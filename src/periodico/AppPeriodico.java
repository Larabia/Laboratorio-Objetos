package periodico;

import java.awt.Dimension;
import java.util.Scanner;

public class AppPeriodico {

	public static void main(String[] args) {

		Vineta[] pagina = new Vineta[5];
		Scanner scan = new Scanner(System.in);

		System.out.println("APLICACION PERIODICO");
		System.out.println("====================");

		for (int i = 0; i < pagina.length; i++) {

			System.out.println("Seleccione tipo de vineta 1.Publicidad| 2.Articulo");
			int opcion = scan.nextInt();

			System.out.println("Ingrese ubicacion fisica de la imagen: ");
			String img = scan.next();
			System.out.println("Ingrese link: ");
			String link = scan.next();
			System.out.println("Ingrese seccion: ");
			String sec = scan.next();
			System.out.println("Ingrese posicion: ");
			String pos = scan.next();
			System.out.println("Ingrese alto: ");
			int alto = scan.nextInt();
			System.out.println("Ingrese alto: ");
			int ancho = scan.nextInt();

			Dimension dim = new Dimension(alto, ancho);

			switch (opcion) {
			case 1:
				System.out.println("Ingrese auspiciante: ");
				String aus = scan.next();
				
				System.out.println("Ingrese precio: ");
				float pre = scan.nextFloat();
				
				pagina[i] = new Publicidad(img, link, sec, pos, dim, aus, pre);

				break;

			case 2:
				System.out.println("Ingrese autor: ");
				String autor = scan.next();
				pagina[i] = new Articulo(img, link, sec, pos, dim, autor);

				break;

			default:
				break;
			}

		}
		
		float total = 0;
		Publicidad itemPubli;

		for (int i = 0; i < pagina.length; i++) {
			System.out.println(pagina[i]);

			if (pagina[i].esFacturable()) {
				//casting para convertir el objeto Viñeta en publicidad y acceder a los metedos de publicidad
				itemPubli = (Publicidad) pagina[i];
				total += itemPubli.getPrecio();
			}
		}
		
		System.out.println("El total facturado es: " + total);

	}

}
