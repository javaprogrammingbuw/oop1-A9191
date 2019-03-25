package Soccer;

public class SoccerPlayer {
	private String name;
	private int number;
	private SoccerTeam team;
	private int goals;
	private int yellowCard;
	private int redCard;
	
	// constructor(s)
	public SoccerPlayer() {}
	
	public SoccerPlayer( String name){
		this.name = name;
	}
	
	
	// setters
	public void yellowCard() {
		if (this.yellowCard==1){
			redCard();
		}
		else{
			this.yellowCard=1;
		}
	}
	
	public void redCard() {
		this.redCard=1;
	}
	
	// other methods
	public int getNumber(){
		return number;
	}
	
	public void setNumber(int number){
		
		if (number<12){
			
		this.number = number; 
		}
	}
	public String getName(){
		return name;
	}
	

	public SoccerTeam getTeam(){

		return team;
	}
	
	public void increaseGoalCount(){
		goals+=1;
		
	}
	public void setTeam(SoccerTeam newTeam){
		this.team=newTeam;
	}
	
	public String toString() {
		return "player: " + name + " | number : " + number + " | team: " + team.getName() + " | goals: " + goals; 
	}
}
