
public class Game {
	private int score;
	private int rolls[] = new int[21];
	private int currentRoll= 0;
	private int currentScore= 0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		// TODO Auto-generated method stub
		score = 0;
		int i = 0;
		for(int frame = 0; frame<10; frame++) {
			currentScore = rolls[i]+rolls[i+1];
			score += currentScore;
			if (currentScore == 10) {
				score += rolls[i+2];
			}
			i += 2;
		}
		return score;
	}

}
