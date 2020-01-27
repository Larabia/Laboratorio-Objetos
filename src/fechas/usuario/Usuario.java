package fechas.usuario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Usuario {

	public static String nombre;
	public static String apellido;
	public String fechaNac;
	public String usuario;
	public String contrasena;
	
	
	public Usuario(String nombre, String apellido, String fechaNac, String usuario, String contrasena) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}
	
	
	public static String NombreOrdenado(String nombre, String apellido) {
	
        
        String inicialNom = String.valueOf(nombre.charAt(0));
        String inicialAp = String.valueOf(apellido.charAt(0));
        
        String nomMayus = inicialNom.toUpperCase();
		String apMayus = inicialAp.toUpperCase();  
        
		String nomLow = nombre.toLowerCase();
		String apLow = apellido.toLowerCase();
		
		nombre = nomLow.substring(1);
		apellido = apLow.substring(1);
        
		return apMayus + apellido + ", " + nomMayus + nombre;  
		
	}
	
	public static String caducidadContrasena (Date ahora) {
		
		GregorianCalendar cadu3meses = new GregorianCalendar();
		cadu3meses.setTime(ahora);
		cadu3meses.add(Calendar.MONTH, 3);
		SimpleDateFormat sdf = new SimpleDateFormat(Constantes.FORMATO_FECHA_STD);
		Date caduDate = cadu3meses.getTime();
		
		return "Su contrasena cauduca el " + sdf.format(caduDate);
	}

	
}
