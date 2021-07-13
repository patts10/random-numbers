package classes;

import java.util.List;
import java.util.stream.Collectors;

import helpers.ListFile;

public class SearchNumber {

	public static void findNumber(String fileName, int num ) {
		
		ListFile listFile = new ListFile();
		
		try {
			
			List<Integer> fileContent = listFile.listFile(fileName)
					.stream()
					.filter( (i) -> i== num )
					.collect(Collectors.toList());

			if (fileContent.contains(num)) {
			    System.out.println("Su número existe");
			} else {
			    System.out.println("Su numero no existe en este archivo");
				return;
			}
			
		} catch (Exception e) {
			System.out.println("No se pudo realizar la tarea");
			e.printStackTrace();
		}
		
	}
}
