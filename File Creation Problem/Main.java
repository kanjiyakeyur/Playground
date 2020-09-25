// import the respective packages
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main{
  public static void main (String[] args) throws IOException{
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String filePath = sc.nextLine();
    File file = new File(filePath);
    boolean create;
    create = file.createNewFile();
    
    if(create){
      System.out.println("File created");
    }
    else{
      System.out.println("File already exists");

    }
  }
}