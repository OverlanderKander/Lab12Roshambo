// import java.util.Scanner;

public class HumanPlayer extends Player {
	private String name;
	private Roshambo rps;
//	private Scanner sc = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public Roshambo getRps() {
		return rps;
	}

	public void setName(String name) {
//		System.out.println("Enter your name: ");
		this.name = name;
	}

	public Roshambo setRps(int j) {
		 
		if (j == 1) {
			rps = Roshambo.ROCK;
		} else if (j == 2) {
			rps = Roshambo.PAPER;
		} else {
			rps = Roshambo.SCISSORS;
		} 
		return rps;
	}
}
