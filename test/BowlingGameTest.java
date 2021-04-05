import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
	
	private Game g;
	private int pins;
	@Before
	public void setUp() {
		g = new Game();
	}
	
	@Test
	public void testGutterGame() {
		pins=0;
		for (int i=0;i<20;i++) {
			g.roll(pins);
		}
		assertEquals(0,g.score());
	}
	@Test
	public void testAllOnes() {
		pins=1;
		for (int i=0;i<20;i++) {
			g.roll(pins);
		}
		assertEquals(20,g.score());
	}

}
