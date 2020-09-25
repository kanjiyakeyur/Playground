// import the respective packages
import java.util.Scanner;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String word = sc.nextLine();
    String[] sp = s.split(" ");
    int cn = 0;
    for(int i = 0; i<sp.length; i++){
     if(sp[i].equalsIgnoreCase(word)){
       cn++;
     }
    }
    System.out.print(cn);
  }
}