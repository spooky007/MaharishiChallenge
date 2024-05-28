import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountSquarePairsTest {

	@Test
	void test() {
		CountSquarePairs count = new CountSquarePairs();
		assertEquals(2, count.countSquarePairs(new int[] { 9, 0, 2, -5, 7 }));
		assertEquals(0, count.countSquarePairs(new int[] { 9 }));
	}

}
