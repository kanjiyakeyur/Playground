// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.*;
import java.util.regex.*;
//Main class to control all other classes
public class Main{
  
  static class Bill{
   protected int billNumber;
    protected String name;
    
    Bill(int billNumber, String name){
     this.billNumber = billNumber;
      this.name = name;
    }
    
    public double generateBill(){
     System.out.println(billNumber);
      System.out.println(name);
      return 0.0;
    }
  }
  
  static class ElectricityBill extends Bill{
   private int numberOfUnitsConsumed;
    private double cosPerUnit;
    
    ElectricityBill(int numberOfUnitsConsumed,double cosPerUnit,
                    int billNumber, String name){
        super(billNumber, name);
      this.numberOfUnitsConsumed = numberOfUnitsConsumed;
      this.cosPerUnit = cosPerUnit;
      
    }
    
    public double generateBill(){
     return this.numberOfUnitsConsumed * this.cosPerUnit;
    }          
  }
  
  
  static class PhoneBill  extends Bill{
   private int numberOfCalls;
    private double costPerCalls;
    
    PhoneBill(int numberOfCalls,double costPerCalls,
                   int billNumber , String name){
        super(billNumber, name);
      this.numberOfCalls = numberOfCalls;
      this.costPerCalls = costPerCalls;
    }
    
    public double generateBill(){
     return (this.numberOfCalls * this.costPerCalls);
    }         
  }
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    ElectricityBill elb;
    PhoneBill pnb;
    int bill = sc.nextInt();
    sc.nextLine();
    String name = sc.nextLine();
    int call = sc.nextInt();
     double price = sc.nextDouble();
		if(Pattern.matches("[a-zA-Z ]+", name)){
          
      	elb = new ElectricityBill(call, price,bill,name);
          
          bill = sc.nextInt();
    sc.nextLine();
    name = sc.nextLine();
    call = sc.nextInt();
     price = sc.nextDouble();
          if(Pattern.matches("[a-zA-Z ]+", name)){
    pnb = new PhoneBill(call, price,bill,name);
    
    System.out.println("Bill Number: " + elb.billNumber);
    System.out.println("Customer Name:" + elb.name);
    System.out.println("Electricity Bill Amount: " + elb.generateBill());
    System.out.println("Bill Number: " + pnb.billNumber);
    System.out.println("Customer Name:" + pnb.name);
    System.out.println("Phone Bill Amount: " + pnb.generateBill());
          }
          else{
                      System.out.println("Invalid Input");

          }
        }
    else{
          System.out.println("Invalid Input");
    }
    
    
    
  }
}