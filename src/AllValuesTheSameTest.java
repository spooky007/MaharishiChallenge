import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllValuesTheSameTest {

	@Test
	void test() {
		AllValuesTheSame sameValues = new AllValuesTheSame();
		assertEquals(1, sameValues.allValuesTheSame(new int[] { 1, 1, 1, 1 }));
		assertEquals(1, sameValues.allValuesTheSame(new int[] { 83, 83, 83 }));
		assertEquals(1, sameValues.allValuesTheSame(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }));
		assertEquals(0, sameValues.allValuesTheSame(new int[] { 1, -2343456, 1, -2343456 }));
		assertEquals(0, sameValues.allValuesTheSame(new int[] { 0, 0, 0, 0, -1 }));
		assertEquals(1, sameValues.allValuesTheSame(new int[] { 432123456 }));
		assertEquals(1, sameValues.allValuesTheSame(new int[] { -432123456 }));
		assertEquals(0, sameValues.allValuesTheSame(new int[] {}));
	}
}
