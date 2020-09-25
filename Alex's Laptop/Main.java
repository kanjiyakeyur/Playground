// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.regex.*;
import java.util.Scanner;
//Main class to control all other classes
public class Main{
  static class Laptop{
    String brandName;
	String processorName;
	String os;
	Long processorRange;
	Long ram;
    
    Laptop(String brandName,String processorName,String os,Long processorRange,Long ram){
      
        this.brandName = brandName;
        this.processorName =processorName;
        this.os = os;
        this.processorRange = processorRange;
        this.ram = ram;
      
    }
    void displayLaptopDetails(){
      if(processorRange> 0 && ram> 0){
      System.out.println("Laptop Details");
      System.out.println("Laptop Brand: " + brandName);
      System.out.println("Processor Name: " + processorName);
      System.out.println("OS: " + os);
      System.out.println("Processor Range: " + processorRange + " bit");
      System.out.println("Ram: " + ram + " GB");
       }
      else{
       System.out.println("Invalid Input");
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String brandName = sc.nextLine();
	String processorName = sc.nextLine();
	String os = sc.nextLine();
	Long processorRange = sc.nextLong();
	Long ram = sc.nextLong();
    
    Laptop l = new Laptop(brandName, processorName, os, processorRange, ram);
    l.displayLaptopDetails();
  }
}