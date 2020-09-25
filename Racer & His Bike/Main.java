// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.*;
//Main class to control all other classes
public class Main{
  static class BasicInfoOfBike {
     protected String model; 
	 protected long mileage; 
    
    BasicInfoOfBike(String model,long mileage){
     this.model = model;
      this.mileage = mileage;
    }
  }
  
  static class AdvancedInfoOfBike extends BasicInfoOfBike{
    private String bikeOwnedBy; 
	private String color; 
	private String bikeNumber; 
    
    AdvancedInfoOfBike(String model,long mileage, String bikeOwnedBy,
                      String color,String bikeNumber){
      super(model,mileage);
      
     this.bikeOwnedBy = bikeOwnedBy;
      this.color = color;
      this.bikeNumber = bikeNumber;
    }
    
    public void displayDetails(){
      System.out.println("Bike Details:");
      System.out.println("Bike model: " + this.model);
    System.out.println("Mileage: " + this.mileage + " km/l");
    System.out.println("Company name: " + this.bikeOwnedBy);
    System.out.println("Bike color: " + this.color);
    System.out.println("Bike Number: " + this.bikeNumber);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String model = sc.nextLine();
    long mil = sc.nextLong();
    sc.nextLine();
    String coname = sc.nextLine();
    String color = sc.nextLine();
    String noplate = sc.nextLine();
    
    AdvancedInfoOfBike ai = new AdvancedInfoOfBike(model,mil,coname,color,noplate);
    ai.displayDetails();
  }
}