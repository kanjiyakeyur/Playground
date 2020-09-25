import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
	    String n = sc.next();
	    
	    runlen r = (s) -> {
	    	int cn = 1;
	    	for(int i=0 ; i<s.length(); i++) {
	    		if(i == s.length()-1) {
	    			if(cn==1) {
	    				System.out.print(String.valueOf(s.charAt(i)));
	    			}
	    			else {
	    				System.out.print(cn + String.valueOf(s.charAt(i)));
	    				cn = 1;
	    			}
	    		}
	    		else if(s.substring(i, i+1).equals(s.substring(i+1, i+2))) {
	    			cn++;
	    		}
	    		else {
	    			if(cn==1) {
	    				System.out.print(String.valueOf(s.charAt(i)));
	    			}
	    			else {
	    				System.out.print(cn + String.valueOf(s.charAt(i)));
	    				cn = 1;
	    			}
	    		}
	    	}
	    };
	    
	    r.run(n);
	}
}

interface runlen{
	void run(String s);
}
