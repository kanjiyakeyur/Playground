// import the respective packages
import java.util.Scanner;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    sb.append(sc.nextLine());
     StringBuffer op = new StringBuffer();
    int l = sb.length();
    if(l % 2== 0){
      op.append(sb.substring(0,1));
      op.append(sb.substring(l/2-1, l/2+1));
      op.append(sb.substring(l-1));
    }
    else{
      op.append(sb.substring(0,1));
      op.append(sb.substring((int)l/2, (int)l/2+1));
      op.append(sb.substring(l-1));
    }
    
    System.out.println(op);
  }
}