
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    magic m = (x) -> {
	    	int sum = 0;
	    	int temp = x;
	    	while(true) {
	    		while(temp!=0) {
	    			sum += temp % 10;
	    			temp = temp / 10;
	    		}
	    		if(sum < 10) {
	    			break;
	    		}
	    		temp= sum;
	    		sum = 0;
	    	}
	    	if(sum == 1)
	    		System.out.println(x + " is a Magic Number.");
	    	else
	    		System.out.println(x + " is not a Magic Number.");
	    };
	    m.magicno(n);
	}
}

interface magic{
	void magicno(int x);
}