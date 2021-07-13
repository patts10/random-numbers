package classes;
import java.util.Arrays;
import java.util.List;

public class GenNumApp {
	public static void main(String[] args)  {
		
			
		GetInput input = new GetInput();
		
		System.out.println("OPCIONES\n");
		System.out.println("0 - Menu");
		System.out.println("1 - Genera nuevo archivo");
		System.out.println("2 - Lee archivo generado");
		System.out.println("3 - Ordena archivo");
		System.out.println("4 - Lee archivo ordenado");
		System.out.println("5 - Buscar numero en archivo");
		System.out.println("6 - salir\n");
		
		String option = input.getOption("Seleccione una opción: ");
		
		ReadOption readOption = new ReadOption();
		
		readOption.options(option);

			
			
	}
}
