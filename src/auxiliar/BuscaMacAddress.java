package auxiliar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscaMacAddress {

	public static String getMacAddress() {
		
			// Respuesta del metodo
			String respuestaMacAddress = null;
	        // Comando a ejecutar
	        String[] comando = {"ipconfig", "/all"};

	        try {
	            // Crear el proceso
	            ProcessBuilder builder = new ProcessBuilder(comando);
	            builder.redirectErrorStream(true); // Combinar salida de error y salida est�ndar
	            Process proceso = builder.start();

	            // Leer la salida del comando
	            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
	            String linea;
	            Boolean esAdaptadorWifi=false;
	            
	         // Patr�n regex para encontrar la MAC Address
	            Pattern macPattern = Pattern.compile("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
	            
	            while ((linea = reader.readLine()) != null) {
	              
	                if (linea.contains("Adaptador")) 
	                	if(linea.contains("Wi-Fi")) 
	                		esAdaptadorWifi = true;
	                	else
	                		esAdaptadorWifi = false;
	                  
	                if(esAdaptadorWifi) {
	                	 Matcher matcher = macPattern.matcher(linea);
	                     if (matcher.find()) {
	                    	 
	                         String macAddress = matcher.group();
	                         // Suprimir los guiones
	                         macAddress = macAddress.replace("-", "").replace(":", "");
	                         respuestaMacAddress = String.valueOf(macAddress);
	                     }
	                }
	                
	            }

	            // Esperar a que el proceso termine
	            int exitCode = proceso.waitFor();
	            System.out.println("Codigo de salida: " + exitCode);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	      return respuestaMacAddress;
	      
	    }
}
