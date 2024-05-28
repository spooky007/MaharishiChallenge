import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumSafeTest {

	@Test
	void sumSafeTest() {
		SumSafe sumSafe = new SumSafe();
		assertEquals(0, sumSafe.isSumSafe(new int[] { 5, -5, 0 }));
		assertEquals(1, sumSafe.isSumSafe(new int[] { 5, -2, 1 }));
	}

}
