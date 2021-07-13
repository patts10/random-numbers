package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
	
	//This class reads a file that is passed as arg and return the content.
	
	public static void showContent(String file) {
		       
		String fileName = "../files/" + file + ".txt";
		boolean checkFile = new File("../files/", fileName).exists();
		
        try {
            
            if (checkFile) {
				
            	Scanner input = new Scanner(new File(fileName));    
            	System.out.println("=============================");
            	System.out.println("\t***** " + file.toUpperCase() + " *****");
            	System.out.println("=============================");
            	
            	while (input.hasNextLine()) {
            		
            		String line = input.nextLine();
            		System.out.println(line);
            	}
            	input.close();
			} else {
				System.out.println("Archivo no encontrado");
				System.exit(0);
			}
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
