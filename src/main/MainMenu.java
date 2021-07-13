package main;

import classes.GetInput;
import classes.ReadOption;

public class MainMenu {

	public static void main(String[] args) {
		
		GetInput input = new GetInput();
		
		System.out.println("********************************");
		System.out.println("            OPCIONES");
		System.out.println("********************************\n");
		System.out.println("1 - Generar archivo");
		System.out.println("2 - Leer archivo");
		System.out.println("3 - Ordenar archivo");
//		System.out.println("4 - Leer archivo ordenado");
		System.out.println("4 - Buscar numero en archivo");
		System.out.println("5 - salir\n");
		
		String option = input.getOption("Seleccione una opción: ");
		
		ReadOption readOption = new ReadOption();
		
		readOption.options(option);			
			
	}
}
