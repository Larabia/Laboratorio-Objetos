package metodosStrig;

import java.util.Scanner;

public class AppMayuscula {
	public static void main(String[] args) {
		
		System.out.println("Ingrese su nombre: "); 
		Scanner scan = new Scanner(System.in);
		String nom = scan.nextLine();
		
		System.out.println("Ingrese su apellido: "); 
		String ap = scan.nextLine();
        
        String inicialNom = String.valueOf(nom.charAt(0));
        String inicialAp = String.valueOf(ap.charAt(0));
        
        String nomMayus = inicialNom.toUpperCase();
		String apMayus = inicialAp.toUpperCase();  
        
		String nombre = nom.toLowerCase();
		String apellido = ap.toLowerCase();
		
		nombre = nombre.substring(1);
		apellido = apellido.substring(1);
        
		System.out.println(apMayus + apellido + ", " + nomMayus + nombre);        
        
		
		
	}

}
