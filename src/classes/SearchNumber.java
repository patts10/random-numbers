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
			
			System.out.println(fileContent.get(0));
			if (fileContent.size() == 0) {
				System.out.println("Su numero no existe en este archivo");
				return;
			}
			
			if (fileContent.get(0) == num) {
				System.out.println("Su número existe");
			} else {
				System.out.println("Su numero no existe en este archivo");
			}
			
		} catch (Exception e) {
			System.out.println("No se pudo realizar la tarea");
			e.printStackTrace();
		}
		
	}
}
