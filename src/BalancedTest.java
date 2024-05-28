import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BalancedTest {

	@Test
	void test() {
		Balanced balanced = new Balanced();
		assertEquals(1, balanced.isBalanced(new int[] { -2, 3, 2, -3 }));
		assertEquals(1, balanced.isBalanced(new int[] { -2, 2, 2, 2 }));
		assertEquals(0, balanced.isBalanced(new int[]  {-5, 2, -2}));
	}
}
