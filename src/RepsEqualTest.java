import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepsEqualTest {

	@Test
	void repsEqualTest() {
		RepsEqual repsEqual = new RepsEqual();
		assertEquals(1, repsEqual.repsEqual(new int[] { 3, 2, 0, 5, 3 }, 32053));
		assertEquals(0, repsEqual.repsEqual(new int[] { 3, 2, 0, 5 }, 32053));
		assertEquals(0, repsEqual.repsEqual(new int[] { 3, 2, 0, 5, 3, 4 }, 32053));
		assertEquals(0, repsEqual.repsEqual(new int[] { 2, 3, 0, 5, 3 }, 32053));
		assertEquals(0, repsEqual.repsEqual(new int[] { 9, 3, 1, 1, 2 }, 32053));
		assertEquals(1, repsEqual.repsEqual(new int[] { 0, 3, 2, 0, 5, 3 }, 32053));
	}
}
