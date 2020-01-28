package estacionDeServicio;

import java.util.Scanner;

public class EstacionDeServicio {
	public static void main(String[] args) {
		float[][] matriz = new float[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = 0;
			}
		}// Para inicializar la matriz y ponerla en 0
		
		
		int totalTipoNafta[] = new int[3]; // Totales por Nafta
		int totalPorEstacion[] = new int[3]; // Totales por Estacion
		String nombres[] = { "Centro", "Norte", "Sur" };
		String[] naftas = { "Gasoil", "Super", "Premium" };

		System.out.println("SURTIDORES");
		System.out.println("==========");
		System.out.println("Ingrese cantidad de litros: ");
		Scanner scan = new Scanner(System.in);
		float litros = scan.nextFloat();

		while (litros != 0) { // al ingresar 0, se termina el loop
			System.out.println("Ingrese tipo de nafta: ");
			System.out.println("0) Gasoil");
			System.out.println("1) Super");
			System.out.println("2) Premium");
			
			int nafta = scan.nextInt();
			float costoTotal = 0;

			switch (nafta) {
			case 0:
				costoTotal = litros * 10;
				break;
			case 1:
				costoTotal = litros * 20;
				break;
			case 2:
				costoTotal = litros * 40;
				break;

			}

			System.out.println("Ingrese estación de Servicio: ");
			System.out.println("0) Centro");
			System.out.println("1) Norte");
			System.out.println("2) Sur");
			int estacion = scan.nextInt();

			matriz[nafta][estacion] += costoTotal;
			totalTipoNafta[nafta] += costoTotal;
			totalPorEstacion[estacion] += costoTotal;

			System.out.println("SURTIDORES");
			System.out.println("==========");
			System.out.println("Ingrese cantidad de litros: ");
			litros = scan.nextFloat();

		}

		System.out.println("Total ganancias por estacion de servicio");
		System.out.println("========================================");

		for (int i = 0; i < totalPorEstacion.length; i++) {

			System.out.println("Estacion " + nombres[i] + ": " + + totalPorEstacion[i]);

		}

		System.out.println("Total ganancias por tipo de nafta");
		System.out.println("=================================");

		for (int i = 0; i < totalTipoNafta.length; i++) {

			System.out.println("Nafta " + naftas[i] + ": " + totalTipoNafta[i]);

		}
		System.out.println("Tipo de nafta más vendido");
		System.out.println("=========================");
		int masVendido = 0;
		int indiceMasVendido = 0;

		for (int i = 0; i < totalTipoNafta.length; i++) {
			if (totalTipoNafta[i] > masVendido) {
				masVendido = totalTipoNafta[i];
				indiceMasVendido = i;
			}
		}

		System.out.println(naftas[indiceMasVendido] +": " + masVendido);

	}

}
