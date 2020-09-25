// import the respective packages

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int dnum = sc.nextInt();
	    int size = sc.nextInt();
	    int[] ar = new int[1];
	    
	    try {
	    	int c = dnum / num;
	    	c = ar[size];
	    	
	    }
	    catch(Exception e) {
	    	System.out.println("In the catch block due to Exception = " + e);
	    }
	    System.out.println("End Of Main");
	    
	  }
}