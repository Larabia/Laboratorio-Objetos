package fechas.usuario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ValidacionUsuario {
	
	public static boolean validarMayor(Date fechaNacim) {

		// genera fecha en base al calculo -18 años de la fecha actual
		GregorianCalendar limite18 = new GregorianCalendar();
		limite18.add(Calendar.YEAR, -18);
		
		// compara si tiene 18 años
		return fechaNacim.before(limite18.getTime());
	}
	
	public static boolean validarCaracteresCon(String contrasena) {
		
		return contrasena.length()== 8;
	}
	
	
	public static boolean ValidarFechaPasado (Date fecha) {
		
		return fecha.before(new Date());
	}

}