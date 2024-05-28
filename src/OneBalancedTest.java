import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneBalancedTest {

	@Test
	void test() {
		OneBalanced balanced = new OneBalanced();
		assertEquals(1, balanced.isOneBalanced(new int[] { 1, 1, 1, 2, 3, -18, 45, 1 }));
		assertEquals(0, balanced.isOneBalanced(new int[] { 1, 1, 1, 2, 3, -18, 45, 1, 0 }));
		assertEquals(0, balanced.isOneBalanced(new int[] { 1, 1, 2, 3, 1, -18, 26, 1 }));
		assertEquals(1, balanced.isOneBalanced(new int[] {}));
		assertEquals(1, balanced.isOneBalanced(new int[] { 3, 4, 1, 1 }));
		assertEquals(1, balanced.isOneBalanced(new int[] { 1, 1, 3, 4 }));
		assertEquals(0, balanced.isOneBalanced(new int[] { 3, 3, 3, 3, 3, 3 }));
		assertEquals(0, balanced.isOneBalanced(new int[] { 1, 1, 1, 1, 1, 1 }));
	}
}
