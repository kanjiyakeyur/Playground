import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	    Scanner sc  = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    if(n>=0) {
	    	
	    	fec f = (int x) -> {
	    		int m = 1;
	    		for (int i =x ; i>0;i--) {
	    			m *=i;
	    		}
	    		System.out.println(m);
	    	};
          f.fact(n);
	    }
	    else {
	    	System.out.println("Invalid Input");
	    }
	  }
	  
	  
}
interface fec {
	
	void fact(int x);
    
}