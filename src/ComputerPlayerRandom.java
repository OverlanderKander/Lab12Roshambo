import java.util.Random;

public class ComputerPlayerRandom extends Player {
	// return name
	String name = "Bullwinkle";

	Roshambo rps;

	Random rand = new Random();

	// return random enum
	public String getName() {
		return name;
	}

	public Roshambo getRps() {

		return rps;
	}

	public void setName(String name) {
		this.name = name;
	}
public Roshambo setRps() {
	int n = rand.nextInt(3);
		if (n == 0) {
			rps = Roshambo.ROCK;
		} else if (n == 1) {
			rps = Roshambo.PAPER;
		} else {
			rps = Roshambo.SCISSORS;
		}
		return rps;
	} 

}
