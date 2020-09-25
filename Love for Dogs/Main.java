import java.util.regex.*;
import java.util.Scanner;
class Main
{
  static class Dog{
   Dog(String name, double weight, int age, String color, String breed){
    if(Pattern.matches("[a-zA-Z ]+",name) && weight>0.0 && age>0){
     System.out.println("Name of the dog: " + name +
"\nWeight of the dog: " + weight +
"\nAge of the dog: " + age +
"\nColor of the dog: " + color +
"\nBreed of the dog: " + breed); 
    }
     else{
       System.out.println("Invalid Input");
     }
   }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    double weight = sc.nextDouble();
    int age = sc.nextInt();
    sc.nextLine()
;   String color = sc.nextLine();
    String breed = sc.nextLine();
    
    Dog d = new Dog(name,weight,age,color,breed);
  }
}