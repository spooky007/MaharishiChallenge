import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllPossibilitiesTest {

	@Test
	void test() {
		AllPossibilities possibilities = new AllPossibilities();
		assertEquals(1, possibilities.isAllPossibilities(new int[] {1, 2, 0, 3}));
		assertEquals(1, possibilities.isAllPossibilities(new int[] {3, 2, 1, 0}));
		assertEquals(0, possibilities.isAllPossibilities(new int[] { 1, 2, 4, 3 }));
		assertEquals(0, possibilities.isAllPossibilities(new int[] { 0, 2, 3 }));
		assertEquals(1, possibilities.isAllPossibilities(new int[] { 0 }));
		assertEquals(0, possibilities.isAllPossibilities(new int[] {}));
	}
}
