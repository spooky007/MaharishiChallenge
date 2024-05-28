import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZeroBalancedTest {

	@Test
	void test() {
		ZeroBalanced balanced = new ZeroBalanced();
		assertEquals(1, balanced.isZeroBalanced(new int[] { 1, 2, -2, -1 }));
		assertEquals(1, balanced.isZeroBalanced(new int[] { -3, 1, 2, -2, -1, 3 }));
		assertEquals(0, balanced.isZeroBalanced(new int[] { 3, 4, -2, -3, -2 }));
		assertEquals(1, balanced.isZeroBalanced(new int[] { 0, 0, 0, 0, 0, 0 }));
		assertEquals(0, balanced.isZeroBalanced(new int[] { 3, -3, -3 }));
		assertEquals(0, balanced.isZeroBalanced(new int[] { 3 }));
		assertEquals(0, balanced.isZeroBalanced(new int[] {}));
	}
}
