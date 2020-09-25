// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.Scanner;
//Main class to control all other classes
public class Main{
  static class Order {
    private String userName;
    private int orderTime;
    private String delLocation;
    private double orderPrice;
    
    Order(String userName,int orderTime,String delLocation,double orderPrice){
      this.userName = userName;
      this.orderTime = orderTime;
        this.delLocation = delLocation;
        this.orderPrice = orderPrice;
    }
    public String getUserName(){
     return this.userName; 
    }
    public int getOrderTime(){
     return this.orderTime; 
    }
    public String getDelLocation(){
     return this.delLocation; 
    }
    public double getOrderPrice(){
     return this.orderPrice; 
    }
  }
  
  static class OrderBO{
   void displayAllOrderDetails(Order o){
     System.out.println("Customer name: " + o.getUserName());
     System.out.println("Time takes to deliver: " + o.getOrderTime());
     System.out.println("Delivery Location: " + o.getDelLocation());
     System.out.println("Price: " + o.getOrderPrice());
   }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<1){
     System.out.println("Invalid Input"); 
    }
    else{
    Order[] ord = new Order[n];
    for(int i = 0; i<n;i++){
   		sc.nextLine();
    	String name = sc.nextLine();
      	int time = sc.nextInt();
      	sc.nextLine();
      	String loc = sc.nextLine();
      	double price = sc.nextDouble();
      	ord[i] = new Order(name,time,loc,price);
    }
    System.out.println("Order details");
    for(int i = 0; i<n;i++){
    	System.out.println("Order--" + (i+1));
      	OrderBO bo = new OrderBO();
      	bo.displayAllOrderDetails(ord[i]);
    }
    }
  }
}