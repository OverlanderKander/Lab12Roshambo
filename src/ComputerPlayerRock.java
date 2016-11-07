
public class ComputerPlayerRock extends Player {
	private String name = "Rocky";
	private Roshambo rps; // = Roshambo.ROCK;

	public String getName() {
//		name = "Rocky";
		return name;
	}

	public Roshambo getRps() {
		
		return rps;
	}
	public Roshambo setRps(){
		rps = Roshambo.ROCK;
		return rps;
	}
	
}
