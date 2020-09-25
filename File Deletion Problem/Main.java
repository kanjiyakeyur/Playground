// import the respective packages
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Main{
  public static void main (String[] args) throws IOException{
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    File f = new File(s);
    
    boolean b = f.delete();
	if(b){
      System.out.println("File deleted");
    }
    else{
      System.out.println("File was not deleted");
    }
  }
}