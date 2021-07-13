package helpers;

import java.util.List;

public class PrintFile {
	
	public static void printFile( String fileName, List<Integer> dataFile ) {
		System.out.println("=============================");
		System.out.println("\t***** " + fileName.toUpperCase() + " *****");
		System.out.println("=============================");
		
		for (int i = 0; i < dataFile.size(); i++) {
			
			System.out.println(dataFile.get(i));
		}
		
	}
}
