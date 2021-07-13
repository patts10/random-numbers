package classes;

public class GenerateRandomNumber {
	
	public int randomNumber( int min, int max ) {
	        
	      int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);
	      
	      return randomNum;
	    }

}
