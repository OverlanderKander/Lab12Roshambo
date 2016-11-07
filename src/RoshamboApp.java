import java.util.Scanner;

public class RoshamboApp {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int win = 0;
		int lose = 0;
		int tie = 0;
		String playerName;

		boolean keepGoing = true;
		Player computer = null;

		System.out.println("Welcome to Rock Paper Scissors!");

		HumanPlayer human = new HumanPlayer();

		// get human player name
		System.out.print("\nPlease enter your name: ");

		human.setName(scan.nextLine());
		playerName = human.getName();

		System.out.println("Hi " + playerName);

		String opponentSelect = Validator.getOppenent(scan, "\nWould you like to play against Rocky or Bullwinkle: ");

		if (opponentSelect.toLowerCase().startsWith("r")) {
			computer = new ComputerPlayerRock();
		} else if (opponentSelect.toLowerCase().startsWith("b")) {
			computer = new ComputerPlayerRandom();
		}

		// computer.getName();

		System.out.println("you chose " + computer.getName());

		while (keepGoing) {
			human.setRps(Validator.getInt(scan, "\nWhat do you select? (1. Rock, 2. Paper, 3. Scissors): ", 1, 3));
//			System.out.print("\nWhat do you select? (1. Rock, 2. Paper, 3. Scissors): ");
//			human.setRps(scan.nextInt());
			
			computer.setRps();
			System.out.print(human.getName() + ": " + human.getRps() + " & ");
			// set opponent selection
			computer.setRps();

			System.out.println(computer.getName() + ": " + computer.getRps());

			if ((human.getRps() == Roshambo.ROCK && computer.getRps() == Roshambo.SCISSORS)
					|| (human.getRps() == Roshambo.SCISSORS && computer.getRps() == Roshambo.PAPER)
					|| (human.getRps() == Roshambo.PAPER && computer.getRps() == Roshambo.ROCK)) {
				System.out.println("You WIN!");
				win++;
			} else if (human.getRps() == computer.getRps()) {
				System.out.println("DRAW");
				tie++;
			} else {
				System.out.println("You LOSE!");
				lose++;
			}

			String yesOrNo = Validator.getYesOrNo(scan, "Continue? (y/n): ");
			if (yesOrNo.equalsIgnoreCase("N")) {
				keepGoing = false;
				// System.out.println("\nGoodbye.");
				scan.close();
			}
		}

		System.out.println("Final score: " + human.getName() + ": " + win + ", " + computer.getName() + ": " + lose + ", Ties: " + tie);
	}
}