package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class CreateFile {
	

	
	public static void SaveFile( String route, List<Integer> content ) {
		
		try {

            File file = new File(route);
            
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i < content.size(); i++) {
//            	bw.write(content.get(i));
            	bw.write(content.get(i).toString());
            	
            	bw.newLine();
			}
             
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
//		try {
//
//            File file = new File(route);
//            
//            // Si el archivo no existe es creado
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(content);
//            bw.close();
//            System.out.println("\nSe ha creado el archivo exitosamente");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
	}

	
}
