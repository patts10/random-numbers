package helpers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListFile {

	//Return a List of number from the file
	
	public List<Integer> listFile(String file ) {
		
		List<Integer> list = new ArrayList<>();
		String fileName = "../files/" + file + ".txt";
		boolean checkFile = new File("../files/", fileName).exists();
		
		try {
			if (checkFile) {

				Scanner input = new Scanner(new File(fileName));   
				
				
				while (input.hasNextLine()) {
					
					String line = input.nextLine();
					list.add(Integer.parseInt(line));
				}
				input.close();				
			}
			else {
				System.out.println("Archivo no encontrado");
				System.exit(0);
			}
			
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
	}
}
