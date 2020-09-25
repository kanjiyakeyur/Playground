// import the respective packages


import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
	    String n = sc.nextLine();
	    String m = sc.next();
	    
	    word w = (x,y) -> {
	    	String[] st = x.split(" ");
	    	int cn = 0;
	    	for(int i=0;i<st.length;i++) {
	    		if(st[i].equalsIgnoreCase(y)) {
	    			cn++;
	    		}
	    	}
	    	System.out.println(y + " - " + cn);
	    };
	    w.wordCheck(n, m);
	}
}

interface word{
	void wordCheck(String s,String p);
}
