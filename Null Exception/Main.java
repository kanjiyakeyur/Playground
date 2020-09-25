// import the respective packages

import java.util.Scanner;
public class Main {

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    String num = sc.nextLine();
	    
	    
	    try {
	    	String[] st;
	    	if(num.length() > 2) {
	    	st = num.split("\\/");
	    	}
	    	else {
	    		st = null;
	    	}
	    	for(int i = 0;i<st.length; i++) {
	    	System.out.println("Splitted string at index "+ i +" is : " + st[i]);	
	    	}
	    	
	    }
	    catch(Exception e) {
	    	System.out.println("Exception : " + e);
	    }
	    finally {
	    System.out.println("Inside finally block");
	    }
	    
	  }

}
