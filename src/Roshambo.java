
public enum Roshambo {
	ROCK, PAPER, SCISSORS;

	@Override
	public String toString() {

		if (ordinal() == 0) {
			return "Rock!!!";
		} else if (ordinal() == 1) {
			return "Paper!!!";
		}
		return "Scissors!!!";
	}
}