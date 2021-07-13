package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class CreateFile {
	

	
	public static void SaveFile( String route, List<Integer> content ) {
		
		GetInput input = new GetInput();
		
		try {

			File file = new File(route);
            
            // Si el archivo no existe es creado
            if(file.exists()) {
            	String ans = input.getAnswer("El archivo ya existe, ¿desea reemplazarlo? y/n");            	
            	if(ans.equals("n")) {
            		System.out.println("La tarea ha sido cancelada");
            		System.exit(0);
            	}           	
            	
            } 
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i < content.size(); i++) {

            	bw.write(content.get(i).toString());
            	
            	bw.newLine();            		
            }
            System.out.println("\nSe ha creado el archivo exitosamente");
            bw.close();            		

	} catch (Exception e) {
        	System.out.println("No se pudo realizar la tarea");
            e.printStackTrace();
        }
	}
	

	
}
