// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
//Main class to control all other classes
public class Main{
  static class Prograd{
    String name;
    long id;
    String skills;
    
    Prograd(String name, long id, String skills){
      if(Pattern.matches("[a-zA-Z ]+", name) && id>0){
       this.name = name;
        this.id = id;
        this.skills = skills;
        
        System.out.println("ProGrad Details");
        System.out.println("ProGrad Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("Skill: " + this.skills);
        
      }
      else{
        System.out.println("Invalid Input");
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    long id = sc.nextInt();
    sc.nextLine();
    String skills = sc.nextLine();
    
    Prograd p = new Prograd(name,id,skills);
  }
}