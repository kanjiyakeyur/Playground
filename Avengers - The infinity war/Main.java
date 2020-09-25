// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.*;
//Main class to control all other classes
public class Main{
  
  static class Avengers{
    protected String name;
	protected int age;
	protected String color;
	protected double percentageYouLikes;
    
    Avengers(String name, int age, String color, double percentageYouLikes)
    {
     this.name = name;
     this.age = age;
     this.color = color;
	 this.percentageYouLikes = percentageYouLikes;
    }
      
    public void setName(String name){
     this.name = name;
    }
    public void setAge(int age){
     this.age = age;
    }
    public void setColor(String color){
     this.color = color;
    }
    public void setPercentageYouLikes(double percentageYouLikes){
     this.percentageYouLikes = percentageYouLikes;
    }
    
    public String getName(){
     return this.name; 
    }
    public int getAge(){
     return this.age; 
    }
    public String getColor(){
     return this.color; 
    }
    public double getPercentageYouLikes(){
     return this.percentageYouLikes; 
    }
  }
  static class Hero extends Avengers{
  	private String strength;
	private String whatKills;
    
    Hero(String name, int age, String color, 
         double percentageYouLikes, String strength, String whatKills)
    {
      super( name,  age,  color,  percentageYouLikes);
     this.strength = strength;
     this.whatKills = whatKills;
    }
    
    public void display()
    {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Color: " + this.color);
    System.out.println("Strength: " + this.strength);
    System.out.println("What Kills: " + this.whatKills);
      if(isLiked()){
    	System.out.println("Liked: Yes");
      }
      else{
    	System.out.println("Liked: No");
        
      }

    
    }
    
    public boolean isLiked()
    {
    
    if(this.percentageYouLikes >= 80){
     return true; 
    }
      else {
       return false; 
      }
    }
    
  }
  
  
  static class Villain extends Avengers{
  	private String strength;
	private String whatKills;
    private String defeatedBy;
    
    Villain(String name, int age, String color, double percentageYouLikes,
         String strength, String whatKills,String defeatedBy)
    {
      super( name,  age,  color,  percentageYouLikes);
     this.strength = strength;
     this.whatKills = whatKills;
      this.defeatedBy = defeatedBy;
    }
    
    public void display()
    {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Color: " + this.color);
    System.out.println("Strength: " + this.strength);
    System.out.println("What Kills: " + this.whatKills);
    System.out.println("Defeated By: null");
      if(isLiked()){
    	System.out.println("Liked: Yes");
      }
    	else{
    		System.out.println("Liked: No");
      }
    }
    
    public boolean isLiked()
    {
    
    if(this.percentageYouLikes >= 80){
     return true; 
    }
      else {
       return false; 
      }
    }
    
  }
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>0){
    sc.nextLine();
    String name = sc.nextLine();
    int age = sc.nextInt();
    sc.nextLine();
    String color = sc.nextLine();
    double perlike = sc.nextDouble();
    sc.nextLine();
    String strth = sc.nextLine();
    String kill = sc.nextLine();
    
    if(n==1){
      Hero hero = new Hero(name,age,color,perlike,strth,kill);
      System.out.println("Avenger Details");
      hero.display();
    }
    else if(n==2){
      String deft = sc.nextLine();
      Villain villain = new Villain(name,age,color,perlike,strth,kill,deft);
      System.out.println("Avenger Details");
      villain.display();
    }
    else{
      System.out.println("Invalid Input");
    }
    }
    else {
      System.out.println("Invalid Input");
    }
  }
}