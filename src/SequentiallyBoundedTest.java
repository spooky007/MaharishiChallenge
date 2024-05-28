import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SequentiallyBoundedTest {

	@Test
	void SequentiallyBoundedTest() {
		SequentiallyBounded seq = new SequentiallyBounded();
		assertEquals(0, seq.isSequentiallyBounded(new int[] { 0, 1 }));
		assertEquals(0, seq.isSequentiallyBounded(new int[] { -1, 2 }));
		assertEquals(1, seq.isSequentiallyBounded(new int[] {}));
		assertEquals(1, seq.isSequentiallyBounded(new int[] { 5, 5, 5, 5 }));
		assertEquals(0, seq.isSequentiallyBounded(new int[] { 5, 5, 5, 2, 5 }));
		assertEquals(0, seq.isSequentiallyBounded(new int[] { 1, 2, 3, 4, 5 }));
		assertEquals(0, seq.isSequentiallyBounded(new int[] { -1, -2, -3, -4, -5 }));
	}

}
