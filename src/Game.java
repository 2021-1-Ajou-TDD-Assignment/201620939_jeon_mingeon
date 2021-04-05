
public class Game {
	private int score;
	private int rolls[] = new int[21];
	private int currentRoll= 0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		// TODO Auto-generated method stub
		score = 0;
		for(int i=0;i<rolls.length;i++) {
			score += rolls[i];
		}
		return score;
	}

}
