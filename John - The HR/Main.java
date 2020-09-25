// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.Scanner;
//Main class to control all other classes
public class Main{
  static class SalaryConfi{
    String name;
    long salary;
    
    public void setName(String name){
      this.name = name;
    }
    public void setSalary(long salary)
    {
      this.salary = salary;
    }
    
    public String getName(){
     return this.name; 
    }
    public long getSalary(){
     return this.salary; 
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<1){
     System.out.println("Invalid Input");
    }
    else{
    SalaryConfi[] emp = new SalaryConfi[n];
    for(int i = 0; i<n;i++){
          sc.nextLine();
    String name = sc.nextLine();
      long sal = sc.nextLong();
      emp[i] = new SalaryConfi();
      
      emp[i].setName(name);
      emp[i].setSalary(sal);
    }
    System.out.println("View Employee's Salary Confidential details");
    for(int i = 0; i<n;i++){
      System.out.println("Name of the Employee: " + emp[i].getName());
      System.out.println("Salary of " + emp[i].getName() + ": " + emp[i].getSalary());
    }
    }
  }
}