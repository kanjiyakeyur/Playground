// import the respective packages

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    
    if(n>1) {
    	
    	primeFactor f = (int x) -> {
    		int m = 2;
    		while(x!=1) {
    			if(x%m==0) {
    				System.out.print(m + " ");
    				x=x/m;
    			}
    			else {
    				m++;	
    			}
    		}
    		
    	};
    	f.prime(n);
    }
    else {
    	System.out.println("Invalid Input");
    }
  }
}

interface primeFactor{
	void prime(int x);
}