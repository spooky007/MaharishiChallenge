import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DualArrayTest {

	@Test
	void test() {
		DualArray dualArray = new DualArray();
		assertEquals(1, dualArray.isDualArray(new int[] { 1, 2, 1, 3, 3, 2 }));
		assertEquals(0, dualArray.isDualArray(new int[] { 2, 5, 2, 5, 5 }));
		assertEquals(0, dualArray.isDualArray(new int[] { 3, 1, 1, 2, 2 }));
	}
}
