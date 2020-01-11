package hojaDeRuta;

import javax.swing.JOptionPane;

public class AppHojaDeRuta {
	
	public static void main(String[] args) {
		String cant = JOptionPane.showInputDialog("Ingrese cantidad de ciudades");
		int cantInt = Integer.valueOf(cant);//convierte string a int

		int ciudadKM[] = new int [cantInt];
		Ciudad ciudades[] = new Ciudad[cantInt];

		for (int i = 0; i < cantInt; i++) {
			// pedir nombre
			String nombre = JOptionPane.showInputDialog("Ingrese nombre ciudad " + (i + 1));

			// pedir kilometro
			String km = JOptionPane.showInputDialog("Ingrese km ubicacion ciudad " + (i + 1));
			int kmCity = Integer.valueOf(km);

			// crear objeto
			ciudades[i] = new Ciudad(nombre, kmCity);
		}

		int acumDist = 0;
		int distMax = 0;
		int diferencia;
		
		for (int i = 0; i < ciudades.length - 1; i++) {
			diferencia = (ciudades[i + 1].getKm() - ciudades[i].getKm());
			// acumlar las diferencias de kms entre ciudades
			acumDist += diferencia;
			if (diferencia > distMax) {
				distMax = diferencia;
			}
		}

		System.out.println("Distancia promedio entre ciudades: " + (acumDist / (cantInt - 1)));
		System.out.println("Distancia maxima entre ciudades: " + distMax);

	
//burbuja para ordenar las ciudades segun de menor a mayor km
		Ciudad aux;
		for (int i = 1; i < ciudades.length; i++) {
			for (int j = 0; j < ciudades.length; j++) {
				if (ciudades[i].getKm() < ciudades[j].getKm()) {
					aux = ciudades[i];
					ciudades[i] = ciudades[j];
					ciudades[j] = aux;
				}

			}

		}
		
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println(ciudades[i].getNombre() + " " + ciudades[i].getKm());
		}
	}
}

	


