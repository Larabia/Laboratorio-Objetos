package adivinarNumero;

import java.util.Random;
import java.util.Scanner;

public class AppAdivinarNumero {
	
	/**
	 * Adivinar un numero entre uno y diez que debe elegir la maquina en forma
	 * aleatoria y una vez acertado debe indicar en cuantos intentos lo descubrimos
	 *
	 */
	
	public static void main(String[] args) {
		

		// calcular numero en forma aleatoria y guardarlo en el objeto na
        NumeroAleatorio na = new NumeroAleatorio(new Random().nextInt(10), 1);
        
        System.out.println("ADIVINA EN QUE NUMERO ESTOY PENSANDO");
        System.out.println("------------------------------------");
        System.out.println("Ingresa el numero: ");
        Scanner scan = new Scanner (System.in);
        int intento = scan.nextInt();
        
        while (intento != na.getNumero()) {
        	
       //acumular intento
        	na.acumularIntento();
        	
        	System.out.println("Has fallado!!! intentalo nuevamente: ");
        	intento = scan.nextInt();
        }
		
        System.out.println("Acertaste!!! el numero es: " + na.getNumero());
        
        if (na.getIntentos() == 1) {
        	System.out.println("Eres todo un mentalista! Adivinaste en el primer intento!");      	
        	
        } else {       	
        	System.out.println("Bueno, solo te llevo " + na.getIntentos() + " intentos"); 
        }
		
		
		
		
	}

}
