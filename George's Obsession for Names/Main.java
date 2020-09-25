// import the respective packages
import java.util.Scanner;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    StringBuffer s = new StringBuffer();
    s.append(sc.nextLine());
    
    for(int i = 0; i<s.length(); i++)
    {
     System.out.println(Character.toUpperCase(s.charAt(i))); 
    }
  }
}