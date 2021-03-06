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
		case "1":
			
			String numbers = input.getNumber("?Cu?ntos n?meros deseas?");
			fileName = input.getTitulo("?Cu?l ser? el nombre del archivo? ");
						
			List<Integer> dataFile = new ArrayList<>();
			int numAsInt = Integer.parseInt(numbers);
			
			for (int i = 0; i < numAsInt ; i++) {
				int num = randomNum.randomNumber(0, 100);
				dataFile.add(num);
			}
			
			CreateFile.SaveFile("../files/" + fileName + ".txt", dataFile);	
//			System.out.println("\nSe ha creado el archivo exitosamente");
			
			PrintFile.printFile(fileName, dataFile);
			
			break;
			
		case "2":
				
			fileName = input.getTitulo("?Cu?l es nombre del archivo?");
			ReadFile.showContent(fileName);	
			
			break;
		
		case "3":
			fileName = input.getTitulo("?Qu? archivo desea ordenar? ");
			OrderFile.orderFile(fileName);
			
			break;
			
//		case "4":
//			fileName = input.getTitulo("?Cu?l es nombre del archivo?");
//			ReadFile.showContent(fileName);
//			
//			break;
			
		case "4":
			int inputNum = Integer.parseInt(input.getNumber("?Cu?l es el n?mero que desea buscar?"));
			fileName = input.getTitulo("?Cu?l es nombre del archivo?");
			
			SearchNumber.findNumber(fileName, inputNum);
			
			break;

		default:
			break;
		}
	}

}
