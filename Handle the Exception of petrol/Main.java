import java.util.Scanner;

public class Main {

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    
	    
	    
	    try {
	    	
	    	String[] num = sc.nextLine().split(" ");
	    	if(num[0].equalsIgnoreCase("null")) {
	    		num = null;
	    	}
	    	System.out.println("Petrol Quantity = " + num[0]);
	    }
	    catch(Exception e) {
	    	System.out.println("Exception : " + e);
	    	System.out.println("There is no fuel in the Bike");
	    }
	   
	    
	  }

}
