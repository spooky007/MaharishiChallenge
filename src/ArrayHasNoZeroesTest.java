import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayHasNoZeroesTest {

	@Test
	void arrayHasNoZeroesTest() {
		ArrayHasNoZeroes arr = new ArrayHasNoZeroes();
		assertEquals(1, arr.arrayHasNoZeroes(new int[] { 1, 2, 3 }));
		assertEquals(0, arr.arrayHasNoZeroes(new int[] { 1, 0, 4, 0 }));
		assertEquals(0, arr.arrayHasNoZeroes(new int[] { 1, 2, 3, 0 }));
		assertEquals(0, arr.arrayHasNoZeroes(new int[] { 0, 0, 0, 0 }));
		assertEquals(1, arr.arrayHasNoZeroes(new int[] {}));

	}

}
