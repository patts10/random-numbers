package classes;

import java.util.Scanner;

public class GetInput {
	
	//This class has methods to catch the input and return it as a string.
	
	Scanner sc = new Scanner(System.in);;
	
	public String getOption(String titulo) {
		
		String option = "";
		
		while( option.equals("") ) {
			System.out.println(titulo);
			option = sc.nextLine();
			
			if(!option.matches("[0|1|2|3|4|5|6]")) {
				option = "";
			}
		}
		return option;
	}
	
	public String getTitulo(String titulo) {
			
			String option = "";
			
			while( option.equals("") ) {
				System.out.println(titulo);
				option = sc.nextLine();
				
				if(!option.matches("[a-zA-Z0-9\\w ]{1,30}")) {
					option = "";
				}
			}
			return option;
	}
	
	public String getNumber(String titulo) {
			
			String num = "";
			
			while( num.equals("") ) {
				System.out.println(titulo);
				num = sc.nextLine();
				
				if(!num.matches("[0-9]{1,3}")) {
					num = "";
				}
			}
			return num;
	}

}
