import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HollowTest {

	@Test
	void test() {
		Hollow hollow = new Hollow();
		assertEquals(1, hollow.isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4 }));
		assertEquals(1, hollow.isHollow(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18 }));
		assertEquals(0, hollow.isHollow(new int[] { 1, 2, 0, 0, 3, 4 }));
		assertEquals(0, hollow.isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 5 }));
		assertEquals(0, hollow.isHollow(new int[] { 3, 8, 3, 0, 0, 0, 3, 3 }));
		assertEquals(0, hollow.isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 0 }));
		assertEquals(0, hollow.isHollow(new int[] { 0, 1, 2, 0, 0, 0, 3, 4 }));
		assertEquals(1, hollow.isHollow(new int[] { 0, 0, 0 }));
	}
}
