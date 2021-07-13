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
			CreateFile.SaveFile(route, fileContent);
			System.out.println("El archivo se ordenó satisfactoriamente");
//			System.out.println(fileContent);
			
		} catch (Exception e) {
			System.out.println("No se pudo realizar la tarea");
			e.printStackTrace();
		}
		
		
	}

}
