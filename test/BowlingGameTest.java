import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BowlingGameTest {
	
	private Game g;
	private int pins;
	private int n;
	@Before
	public void setUp() {
		g = new Game();
	}

	public void rollMany(int n,int pins) {
		for (int i=0;i<n;i++) {
			g.roll(pins);
		}
	}

	private void rollSpare(int firstRoll) {
		g.roll(firstRoll);
		g.roll(10-firstRoll); // spare
	}
	
	@Test
	public void testGutterGame() {
//		pins=0;
//		n=20;
		rollMany(20,0);
		assertEquals(0,g.score());
	}

	@Test
	public void testAllOnes() {
//		pins=1;
//		n=20;
		rollMany(20,1);
		assertEquals(20,g.score());
	}

	
	@Test
	public void testOneSpare() {
		rollSpare(5);
		g.roll(3);
		rollMany(17,0);
		assertEquals(16,g.score());
	}


}
