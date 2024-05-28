import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SetEqualTest {

	@Test
	void test() {
		SetEqual set = new SetEqual();
		assertEquals(1, set.isSetEqual(new int[] { 1, 9, 12 }, new int[] { 12, 1, 9 }));
		assertEquals(1, set.isSetEqual(new int[] { 9, 1, 12, 1 }, new int[] { 1, 9, 12, 9, 12, 1, 9 }));
		assertEquals(1, set.isSetEqual(new int[] { 1, 9, 12, 9, 12, 1, 9 }, new int[] { 12, 1, 9 }));

		assertEquals(0, set.isSetEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 1 }));
		assertEquals(0, set.isSetEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 6 }));
		assertEquals(0, set.isSetEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 6, 8 }));

	}
}
