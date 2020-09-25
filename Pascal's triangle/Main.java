import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    if(n>0) {
	    	
	    	factorial fec = (int x) -> {
	    		int m = 1;
	    		for (int i =x ; i>1;i--) {
	    			m *=i;
	    		}
	    		return m;
	    	};
	    	
	    	ncr nc = (x,y) -> {
	    		return fec.fact(x) / (fec.fact(x-y) * fec.fact(y));
	    	};
	    	
	    	pascalTri p = (int x) -> {
	    		int m = 1;
	    		for(int i = 0; i < x; i++) {
	    	         
	    	         for(int j = 0; j <= i; j++){
	    	        	 System.out.print(nc.ncrcal(i, j) + " " );
	    	         }
	    	         System.out.println();
	    		}
	    		
	    	};
	    	
	    	p.pascal(n);
	    	
	    }
	    else {
	    	System.out.println("Invalid Input");
	    }
	  }
	}

	interface pascalTri{
		void pascal(int x);
	}
	
	interface factorial {
		
		int fact(int x);
	    
	}
	interface ncr{
		int ncrcal(int x, int y);
	}
	