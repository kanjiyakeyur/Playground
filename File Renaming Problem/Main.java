// import the respective packages
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main{
  public static void main (String[] args) throws IOException{
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    File f1 = new File(s1);
	File f2 = new File(s2);
	boolean b = f1.renameTo(f2);
    
    if(b){
      System.out.println("Renamed successfully");
    }
    else{
      System.out.println("error");
    }
   	

  }
}