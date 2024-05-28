import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatchesTest {

	@Test
	void MatchTest() {
		Matches match = new Matches();
		assertEquals(1, match.matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 3, -2, 3 }));
		assertEquals(1, match.matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 2, 1, -1, -1, 2, 1 }));
		assertEquals(1, match.matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 1, 2, -1, -1, 1, 2 }));
		assertEquals(1, match.matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 2, 1, -2, 3 }));
		assertEquals(1, match.matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 1, 1, 1, -1, -1, 1, 1, 1 }));
		assertEquals(0, match.matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 4, -1, 3 }));
		assertEquals(0, match.matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 2, -3, 3 }));
		assertEquals(0, match.matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 8 }));
	}
}
 