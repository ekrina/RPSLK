/**
 * Rules encapsulates every single scenario that could happen in the game and
 * creates a representation in words. Updated to include all events that lizard
 * and spock add.
 * 
 * UPDATED: This class was updated to be used for the graphic version of an
 * RPSKL game. Now the won method takes in two integers of the corresponding
 * gestures numbers and checks who would win. It then returns the shape that won
 * the game.
 * 
 * @author Alexandra Long ael2203
 *
 */
public class Winner {

	/**
	 * The method compVsUserWinner takes in the integers that correspond to gestures
	 * made by the computer and the user. It then checks the array
	 * zeroSumLizardSpock, which is a zero-sum matrix representation of the game,
	 * and determines who has won the current round. If whoWon is 0, then there is a
	 * tie, if it's 1, then the computer has won, and if it's -1, then the user has
	 * won. The method then uses the inputs computer and user to print out a string
	 * from verbsWithMoves. This array along with the winner String, which tells us
	 * who beat who, prints out the message that details exactly what happened in
	 * the round. Updated to include all events that lizard and spock add.
	 * 
	 * @param computer computer gesture in corresponding integer
	 * @param user     user gesture in corresponding integer
	 * @return the integer from the array eventsInGame that corresponds to a spot in
	 *         the matrix depending on the computer and user input
	 */
	public int won(int shapeOne, int shapeTwo) {
		String winner = "";
		int whoWon = zeroSumLizardSpock[shapeTwo][shapeOne];
		String eventHappened = verbsWithMoves[shapeTwo][shapeOne];
		System.out.println(winner + eventHappened);
		return whoWon;
	}

	/**
	 * The zero-sum matrix for the entire rock paper scissors lizard spock game.
	 */
	private int[][] zeroSumLizardSpock = { { 0, -1, 1, 1, -1 }, { 1, 0, -1, -1, 1 }, { -1, 1, 0, 1, -1 },
			{ -1, 1, -1, 0, 1 }, { 1, -1, 1, -1, 0 } };
	/**
	 * All the messages that are possible for each outcome of the round.
	 */
	private String[][] verbsWithMoves = {
			{ "rock", "paper covers rock", "rock crushes scissors", "rock crushes lizard", "Spock vaporizes rock" },
			{ "paper covers rock", "paper", "scissors cuts paper", "lizard eats paper", "paper disproves Spock" },
			{ "rock crushes scissors", "scissors cuts paper", "scissors", "scissors decapitates lizard",
					"Spock smashes scissors" },
			{ "rock crushes lizard", "lizard eats paper", "scissors decapitates lizard", "lizard",
					"lizard poisons Spock" },
			{ "Spock vaporizes rock", "paper disproves Spock", "Spock smashes scissors", "lizard poisons Spock",
					"Spock" } };
}