package studio7;

public class HockeyPlayer {
	
	private String name;
	private int number;
	private int goals;
	private int assists;
	private int games;
	
	public HockeyPlayer(String name, int number) {
		this.name = name;
		this.number = number;
		this.goals = 0;
		this.assists = 0;
		this.games = 0;
	}
	
	public int points() {
		return this.goals + this.assists;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
