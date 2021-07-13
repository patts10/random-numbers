package classes;

import java.util.ArrayList;
import java.util.List;

import helpers.PrintFile;



public class ReadOption {

	public static void options( String option ) {
		
		GetInput input = new GetInput();
		GenerateRandomNumber randomNum = new GenerateRandomNumber();
		
		String fileName = "";
		
		switch (option) {
		case "0":
			
		case "1":
			
			String numbers = input.getNumber("¿Cuántos números deseas?");
			fileName = input.getTitulo("¿Cuál será el nombre del archivo? ");
						
			List<Integer> dataFile = new ArrayList<>();
			int numAsInt = Integer.parseInt(numbers);
			for (int i = 0; i < numAsInt ; i++) {
				int num = randomNum.randomNumber(0, 100);
				dataFile.add(num);
			}
			
			CreateFile.SaveFile("../files/" + fileName + ".txt", dataFile);	
			System.out.println("\nSe ha creado el archivo exitosamente");
			
			PrintFile.printFile(fileName, dataFile);
			
			break;
			
		case "2":
				
			fileName = input.getTitulo("¿Cuál es nombre del archivo?");
			ReadFile.showContent(fileName);	
			
			break;
		
		case "3":
			fileName = input.getTitulo("¿Qué archivo desea ordenar? ");
			OrderFile.orderFile(fileName);
			
			break;
			
		case "4":
			fileName = input.getTitulo("¿Cuál es nombre del archivo?");
			ReadFile.showContent(fileName);
			
			break;
			
		case "5":
			fileName = input.getTitulo("¿Cuál es nombre del archivo?");
			int inputNum = Integer.parseInt(input.getNumber("¿Cuál es el número que desea buscar?"));
			
			SearchNumber.findNumber(fileName, inputNum);
			
			break;

		default:
			break;
		}
	}

}
