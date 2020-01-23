package recorrido;


import java.util.Scanner;

public class AppRecorrido {

	public static void main(String[] args) {
		
		System.out.println("AGENDA SEMANAL DE RECORRIDOS");
		System.out.println("============================");

		Recorrido[] semana = new Recorrido[5];
		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Recorridos para el dia " + dias[i]);
			System.out.println("Ingrese tipo de recorrido 1.Transpote| 2.Turismo| 3.Terminar");
			int opcion = scan.nextInt();
			 scan.nextLine();

			//while (opcion != 3) {

				System.out.println("Ingresar origen: ");
				String or = scan.nextLine();
				System.out.println("Ingresar destino: ");
				String des = scan.nextLine();
				System.out.println("Ingresar precio: ");
				float pre = scan.nextFloat();
				 scan.nextLine();
				/*float pre = 100;*/

				switch (opcion) {
				case 1: {
					semana [i] = new Transporte (or, des, pre);
					break;
				}
				case 2: {

					System.out.println("Ingresar nombre: ");
					String nom = scan.nextLine();
					
					semana [i] = new Turistico (or, des, pre, nom);
					break;
				}
				
				default:
					break;
				}
				
			/*	System.out.println("Ingrese tipo de recorrido 1.Transpote| 2.Turismo| 3.Terminar");
				opcion = scan.nextInt();
				scan.nextLine();

			}*/

		}
		
		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
			System.out.println(semana [i]);

			if (semana[i] instanceof Turistico) {
				System.out.print(" (TURISTICO)");
			}
			else {
				System.out.print(" (TRANSPORTE)");
			}
			System.out.println();
		}

	}

}
