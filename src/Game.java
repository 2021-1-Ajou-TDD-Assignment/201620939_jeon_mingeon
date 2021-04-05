
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
		int frameIndex = 0;
		for(int frame = 0; frame<10; frame++) {
			currentScore = rolls[frameIndex]+rolls[frameIndex+1];
			score += currentScore;
			if (isSpare(currentScore)) {
				score += rolls[frameIndex+2];
			}
			frameIndex += 2;
		}
		return score;
	}
	
	private boolean isSpare(int currentScore) {
		return currentScore == 10;
	}

}
