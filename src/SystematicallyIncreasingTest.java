import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SystematicallyIncreasingTest {

	@Test
	void test() {
		SystematicallyIncreasing object = new SystematicallyIncreasing();
		assertEquals(1, object.isSystematicallyIncreasing(new int[] { 1 }));
		assertEquals(0, object.isSystematicallyIncreasing(new int[] { 1, 2, 1, 2, 3 }));
		assertEquals(0, object.isSystematicallyIncreasing(new int[] { 1, 1, 3 }));
		assertEquals(0, object.isSystematicallyIncreasing(new int[] { 1, 2, 1, 2, 1, 2 }));
		assertEquals(0, object.isSystematicallyIncreasing(new int[] { 1, 2, 3, 1, 2, 1 }));
		assertEquals(0, object.isSystematicallyIncreasing(new int[] { 1, 1, 2, 3 }));
	}
}
