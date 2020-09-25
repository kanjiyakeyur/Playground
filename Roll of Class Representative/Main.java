// import the respective packages
import java.util.*;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] name = s.split(", ");
    
    
    for(int i =0; i< name.length; i++){
     System.out.println(name[i]); 
    }
  }
}