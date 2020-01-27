package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TiposFechas {
	
	public static void main(String[] args) throws ParseException  {
		
		
        //Genero un objeto fecha
		Date ahora = new Date();
		//le pido el dato de la fecha actual al sistema METODO CurrentTimeMillis
		long ahoraLong = System.currentTimeMillis();
		
		//seteo la fecha del objeto date con los datos del sistema
		ahora.setTime(ahoraLong);
		
		//otro modo de obtener la fecha del sistema METODO GetTime
		long ahora2long = ahora.getTime();
		
		//Genero objetos SimpleDateFormat para determinar el estilo de fecha
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("H:mm ss");
		System.out.println(ahora);
		System.out.println(ahoraLong);
		
		//formateo la fecha para mostrarla
		System.out.println("format: "+ sdf.format(ahora));
		System.out.println("format2: "+ sdf2.format(ahora));
		System.out.println("format3: "+ sdf3.format(ahora));
		
		//utilizo el metodo parse para convertir un string en fecha y asignarlo a una variable Date
		Date noventas = sdf.parse("11/11/1990");
		
		System.out.println(noventas);
		System.out.println(sdf.format(noventas));
	}

}
