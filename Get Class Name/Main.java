// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.Scanner;
//Main class to control all other classes
public class Main{
  static class Developer {
    String codeLanguage;
    String projectName;
    
    Developer(String codeLanguage,String projectName)
    {
      this.codeLanguage = codeLanguage;
      this.projectName = projectName;
    }
    public void setCodeLanguage (String codeLanguage){
      this.codeLanguage = codeLanguage;
    }
    public void setProjectName(String projectName)
    {
      this.projectName = projectName;
    }
    
    public String getCodeLanguage(){
     return this.codeLanguage; 
    }
    public String getProjectName(){
     return this.projectName; 
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     String lan = sc.nextLine();
      String proj = sc.nextLine();
    Developer pro = new Developer(lan,proj);

    System.out.println("Developer Details");
      System.out.println("class Developer [" + pro.getCodeLanguage() + " --- " + pro.getProjectName() + "]");
  }
}