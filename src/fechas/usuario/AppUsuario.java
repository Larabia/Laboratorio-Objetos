package fechas.usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import periodico.Publicidad;

public class AppUsuario {

	public static void main(String[] args) throws ParseException {
		
		//Pide por Scanner los datos del usuario
		System.out.println("REGITRARSE COMO USUARIO");
		System.out.println("=======================");
		System.out.println("Ingrese su nombre: ");
		Scanner scan = new Scanner(System.in);
		String nom = scan.nextLine();
		System.out.println("Ingrese su apellido: ");
		String ape = scan.nextLine();
		System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyy): ");
		String fe = scan.nextLine();
		//Genera el formato de fecha
		SimpleDateFormat sdf = new SimpleDateFormat(Constantes.FORMATO_FECHA_STD);

		//Transformo el string de fe en una fecha de tipo Date utilizando el formato sdf
		Date fechaNacim = sdf.parse(fe);
		
		while (!ValidacionUsuario.ValidarFechaPasado(fechaNacim)) {
			System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyy): ");
			fe = scan.nextLine();
		    fechaNacim = sdf.parse(fe);
		}
		
		System.out.println("Ingrese su nombre de usuario: ");
		String usu = scan.nextLine();
		System.out.println("Ingrese su contrasena (debe tener " + Constantes.LONGITUD_CONTRASENA + "caracteres): ");
		String con = scan.nextLine();
		
		while (!ValidacionUsuario.validarCaracteresCon(con)) {
			System.out.println("La contrasena debe tener 8 caracteres");
		    System.out.println("Ingrese su contrasena: ");
		    con = scan.nextLine();
		}
		
		System.out.println("Ingrese nuevamente su contrasena: ");
		String con1 = scan.nextLine();
		
		while (!con.equals(con1)) {
			System.out.println("Tus contrasenas no coinciden intentalo nuevamente");
		    System.out.println("Ingrese su contrasena: ");
		    con = scan.nextLine();
		    System.out.println("Ingrese nuevamente su contrasena: ");
			con1 = scan.nextLine();
			}
		
		//Genera el objeto usuario y asigna los datos
		Usuario usuario1 = new Usuario (nom, ape, fe, usu, con);
		
		
		
		//Ejercicio 2 valido si el usuario es mayor de edad
		if (ValidacionUsuario.validarMayor(fechaNacim)) {
			
			    System.out.println ("Usuario: " + usu);
			
			    //Ejercicio 1 muestra el nombre por pantalla llamando al metodo creado para dar formato al nombre
			    System.out.println ("Nombre: " + usuario1.NombreOrdenado(nom, ape));
			
			    //Ejercicio 1 Muestra la fecha de nacimiento por pantalla con el formato sdf aplicado
			    System.out.println("Fecha de nacimiento: " + sdf.format(fechaNacim));
			
		        //genero un objeto date con la fecha actual
				Date ahora = new Date();
				System.out.println("Bienvenide a nuestro sistema, " + Usuario.caducidadContrasena(ahora));			
			
		}else {
			System.out.println("Usuario invalido");
		}
		
	}

}
