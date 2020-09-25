import java.util.Scanner;

public class Main {

	static interface IPlayerStatistics {
		 public void displayPlayerStatistics ();
	}
	
	static class Player implements IPlayerStatistics{
		private String name;
		private String teamName; 
		private int no0fMatches;
		private long totalgoals;
		
		
		public Player(String name, String teamName, int no0fMatches, long totalgoals) {
			super();
			this.name = name;
			this.teamName = teamName;
			this.no0fMatches = no0fMatches;
			this.totalgoals = totalgoals;
		}


		@Override
		public void displayPlayerStatistics() {
			System.out.println("Player Details");
			System.out.println("Player name: " + name);
			System.out.println("Team name: " + teamName);
			System.out.println("No of matches: " + no0fMatches);
			System.out.println("Total goals: " + totalgoals);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String tname = sc.nextLine();
		int matches = sc.nextInt();
		long goals = sc.nextLong();
		
		if(matches > 0 && goals > 0) {
		IPlayerStatistics i = new Player(name, tname, matches, goals);
		i.displayPlayerStatistics();
		}
		else {
			
			System.out.println("Invalid Input");
		}
		
	}
	
}
