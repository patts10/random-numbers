package classes;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import helpers.ListFile;


public class OrderFile {
	
	public static void orderFile( String file ) {
		
		ListFile listFile = new ListFile();
		String route = "../files/" + file + ".txt";
		
		try {
			List<Integer> fileContent = listFile.listFile(file);
			Collections.sort(fileContent);
			String nameFile = file + "-ordenado.txt";
			route = "../files/" + nameFile;
			CreateFile.SaveFile(route, fileContent);
			System.out.println("Se creó " + nameFile + " con los valores ordenados.");
			
		} catch (Exception e) {
			System.out.println("No se pudo realizar la tarea");
			e.printStackTrace();
		}
		
		
	}

}
