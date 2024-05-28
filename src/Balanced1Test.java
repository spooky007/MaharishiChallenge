import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Balanced1Test {

	@Test
	void test() {
		Balanced1 balanced = new Balanced1();
		assertEquals(1, balanced.isBalanced(new int[] { 2, 3, 6, 7 }));
		assertEquals(1, balanced.isBalanced(new int[] { 6, 7, 2, 3, 12 }));
		assertEquals(0, balanced.isBalanced(new int[] { 7, 15, 2, 3 }));
		assertEquals(0, balanced.isBalanced(new int[] { 16, 6, 2, 3 }));
	}
}
