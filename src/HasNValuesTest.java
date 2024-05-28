import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HasNValuesTest {

	@Test
	void test() {
		HasNValues values = new HasNValues();
		assertEquals(1, values.hasNValues(new int[] { 1, 2, 2, 1 }, 2));
		assertEquals(1, values.hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 3));
		assertEquals(1, values.hasNValues(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 10));
		assertEquals(0, values.hasNValues(new int[] { 1, 2, 2, 1 }, 3));
		assertEquals(0, values.hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 2));
		assertEquals(0, values.hasNValues(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 20));
	}
}
