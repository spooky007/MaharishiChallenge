import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestTest {

	@Test
	void smallestTest() {
		Smallest smallest = new Smallest();
		assertEquals(124, smallest.smallest(3));
		assertEquals(624, smallest.smallest(4));
		assertEquals(624, smallest.smallest(5));
		assertEquals(642, smallest.smallest(6));
		assertEquals(4062, smallest.smallest(7));
	}

}
