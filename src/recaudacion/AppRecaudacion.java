package recaudacion;

import java.util.Random;

public class AppRecaudacion {
	
	// Guardar un objeto de clase Recaudacion por dia del año
	// considerando un año de 360 dias y 12 meses de 30 dias cada uno
	// El objeto recaudacion debera tener importe en efectivo y tarjeta
	// cargados aleatoriamente
	// 1. Mostrar totales de recaudacion de ultimos 6 meses
	// 2. Mostrar totales de recaudacion de mes 4
	
	public static void main(String[] args) {
		
		//Crear un objeto Recaudacion
		Recaudacion[] rec = new Recaudacion[360];
		
		//Guardar un objeto Recaudacion por dia del año con monto aleatorio en efectivo y tarjeta
		for (int i = 0; i < rec.length; i++) {
			rec[i] = new Recaudacion(AppRecaudacion.aleatorio(50), AppRecaudacion.aleatorio(50));
			
		}
		
		//recorrer y acumular el total de los primeros 6 meses
		float total6 = 0;
		for (int i = 180; i < rec.length; i++) {
			total6 += rec[i].getEfectivo() + rec[i].getTarjeta();
		}
		System.out.println("1. Totales ultimos 6 meses: " + total6);

		//recorrer y acumular el total de los primeros 4 meses
		float total4 = 0;
		for (int i = 30 * 3; i < 30 * 4; i++) {
			total4 += rec[i].getEfectivo() + rec[i].getTarjeta();
		}
		System.out.println("2. Totalmes mes 4: " + total4);
	}

	public static int aleatorio(int upperRange) {
		Random random = new Random();
		return random.nextInt(upperRange);
	}
}
