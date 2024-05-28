import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RailRoadTieTest {

	@Test
	void RailRoadTieTest() {
		RailRoadTie tie = new RailRoadTie();
		assertEquals(1, tie.isRailRoadTie(new int[] { 1, 2, 0, 3, -18, 0, 2, 2 }));
		assertEquals(1, tie.isRailRoadTie(new int[] { 1, 2 }));
		assertEquals(1, tie.isRailRoadTie(new int[] { 1, 2, 0, 1, 2, 0, 1, 2 }));
		assertEquals(1, tie.isRailRoadTie(new int[] { 3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3 }));
		assertEquals(0, tie.isRailRoadTie(new int[] { 0, 0, 0, 0 }));
		assertEquals(0, tie.isRailRoadTie(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		assertEquals(0, tie.isRailRoadTie(new int[] { 1, 3, 0, 3, 5, 0 }));
	}

}
