package helpers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListFile {

	//Return a List of number from the file
	
	public List<Integer> listFile(String file ) {
		
		List<Integer> list = new ArrayList<>();
		try {
        	String fileName = "../files/" + file + ".txt";
            Scanner input = new Scanner(new File(fileName));   
            
            while (input.hasNextLine()) {
            	
                String line = input.nextLine();
                list.add(Integer.parseInt(line));
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
	}
	
//	public List<Integer> showContent(String file) {
//		 
//		List<Integer> list = new ArrayList<>();
//		
//      try {
//      	String fileName = "../files/" + file + ".txt";
//          Scanner input = new Scanner(new File(fileName));   
//          
//          System.out.println("=============================");
//  		System.out.println("\t***** " + file.toUpperCase() + " *****");
//  		System.out.println("=============================");
//          
//          while (input.hasNextLine()) {
//          	
//              String line = input.nextLine();
//              list.add(Integer.parseInt(line));
//              System.out.println(line);
//          }
//          input.close();
//      } catch (Exception ex) {
//          ex.printStackTrace();
//      }
//      return list;
//  }
	
}
