import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatchPatternTest {

	@Test
	void test() {
		MatchPattern pattern = new MatchPattern();
		assertEquals(1, pattern.matchPattern(new int[] { 1, 1, 1, 1, 1 }, 5, new int[] { 1 }, 1));
		assertEquals(1, pattern.matchPattern(new int[] { 1 }, 1, new int[] { 1 }, 1));
		assertEquals(1, pattern.matchPattern(new int[] { 1, 1, 2, 2, 2, 2 }, 6, new int[] { 1, 2 }, 2));
		assertEquals(0, pattern.matchPattern(new int[] { 1, 2, 3 }, 3, new int[] { 1, 2 }, 2));
		assertEquals(0, pattern.matchPattern(new int[] { 1, 2 }, 2, new int[] { 1, 2, 3 }, 3));
		assertEquals(0, pattern.matchPattern(new int[] { 1, 1, 2, 2, 2, 2, 3 }, 7, new int[] { 1, 3 }, 2));
		assertEquals(0, pattern.matchPattern(new int[] { 1, 1, 1, 1 }, 4, new int[] { 1, 2 }, 2));
		assertEquals(0, pattern.matchPattern(new int[] { 1, 1, 1, 1, 2, 2, 3, 3 }, 8, new int[] { 1, 2 }, 2));
		assertEquals(0, pattern.matchPattern(new int[] { 1, 1, 10, 4, 3 }, 5, new int[] { 1, 4, 3 }, 3));
	}
}
