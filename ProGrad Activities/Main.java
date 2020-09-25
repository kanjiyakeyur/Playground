
// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.Scanner;
//Main class to control all other classes
public class Main{
  static class Outcome {
    private String progradName ;
    private int id;
    
    Outcome(String progradName,int id){
      this.progradName = progradName;
      this.id = id;
    }
    public String getProgradName(){
     return this.progradName; 
    }
    public int getId(){
     return this.id; 
    }
  }
  
  static class ProgradBO {
   void pointAllProgradDetails(Prograd p,Outcome o){
      String s = String.format("%-15s %-15s %-15s %-15s", 
                               p.getCodeLanguage() , p.getProjectDone(),
                              o.getProgradName(),o.getId()); 
     System.out.println(s);
   }
  }
  static class Prograd {
     private String codeLanguage ;
    private String projectDone;
    Outcome outcome;
    
    Prograd(String codeLanguage,String projectDone, Outcome outcome){
      this.codeLanguage = codeLanguage;
      this.projectDone = projectDone;
       this.outcome = outcome;
    }
    public String getCodeLanguage(){
     return this.codeLanguage; 
    }
    public String getProjectDone(){
     return this.projectDone; 
    }
    public Outcome getOutcome(){
     return this.outcome; 
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<1){
     System.out.println("Invalid Input"); 
    }
    else{
    Outcome[] oc = new Outcome[n];
    Prograd[] prograd = new Prograd[n];
    for(int i = 0; i<n;i++){
   		sc.nextLine();
    	String lang = sc.nextLine();
    	String proj = sc.nextLine();
    	String progradName = sc.nextLine();
      	int id = sc.nextInt();
      	oc[i] = new Outcome(progradName,id);
      	prograd[i] = new Prograd(lang,proj,oc[i]);
    }
      int ch = sc.nextInt();
      while(ch!=4){
      switch(ch){
        case 1:
        	System.out.println("ProGrad Details");
      		String s1 = String.format("%-15s %-15s %-15s %-15s", 
                               "CodeLanguage" , "ProjectName",
                              "ProGradName","Id"); 
    		System.out.println(s1);
        	for(int i = 0; i<n;i++){
        		ProgradBO bo = new ProgradBO();
      			bo.pointAllProgradDetails(prograd[i], oc[i]);
        	}
        	break;
        case 2:
        	 sc.nextLine();
        	 String nm = sc.nextLine();
        	System.out.println("ProGrad Details");
      		String s2 = String.format("%-15s %-15s %-15s %-15s", 
                               "CodeLanguage" , "ProjectName",
                              "ProGradName","Id"); 
     		            System.out.println(s2);
        	for(int i = 0; i<n;i++){
        		if(oc[i].progradName.equals(nm)){
                  	ProgradBO bo = new ProgradBO();
      				bo.pointAllProgradDetails(prograd[i], oc[i]);
                  	break;
                }
        	}
        	break;
        case 3:
            sc.nextLine();
        	int nm2 = sc.nextInt();
        	System.out.println("ProGrad Details");
      		String s3 = String.format("%-15s %-15s %-15s %-15s", 
                               "CodeLanguage" , "ProjectName",
                              "ProGradName","Id"); 
     		System.out.println(s3);
        	for(int i = 0; i<n;i++){
        		if(oc[i].id == nm2){
                  	ProgradBO bo = new ProgradBO();
      				bo.pointAllProgradDetails(prograd[i], oc[i]);
                  	break;
                }
        	}
        	break;
        case 4:
        	break;
      }
      ch = sc.nextInt();
      }
      
    }
  }
}