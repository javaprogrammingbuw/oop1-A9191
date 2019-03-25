package Soccer;

public class SoccerTeam {
	private String name;
	private SoccerTrainer trainer;
	private int tablePos;
	private int position;
	private int goals;
	private int againstgoals;
	private SoccerPlayer[] players = new SoccerPlayer[11];
	  
	public SoccerTeam(String name, SoccerTrainer soccerTrainer, int tablePos){
		this.name = name;
		this.trainer = soccerTrainer;
		this.tablePos = tablePos;
		position = 0;
	}
	
	
	public String getName(){
		return this.name;

	}
	public boolean addPlayer(SoccerPlayer player){
		if(position < 11){
			players[position] = player;
			players[position].setTeam( this );
			players[position].setNumber( position + 1 );
			position += 1; 
		
			return true;
		}
		else{
			return false;
		}
		
		
//		int i = 0;
//		while( i < players.length ) {
//			if( players[ i ] == null ) {
//				// match - found an empty pos
//				players[ i ] = player;
//				break;
//			}
//			
//			++i;
//		}
	}
	
	public void goal(int playerNumber){
		players[ playerNumber - 1 ].increaseGoalCount();
		goals++;
	}
	
	public void goalAgainst(){
		againstgoals++;
	}
	
	public String ratioString(){
		return goals + ":"+ againstgoals;
	}
	
	
	public String toString() {
		String out = "name: " + name + " | trainer: " + trainer + " | ratio: " + ratioString()+" | players:\n";  
		for( SoccerPlayer p : players ) {
			out += p.toString() + "\n";
		}
		
		return out;
	}
}