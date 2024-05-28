import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoopSumTest {

	@Test
	void test() {
		LoopSum sum = new LoopSum();
		assertEquals(3, sum.loopSum(new int[] {1, 2, 3} , 2));
		assertEquals(-1, sum.loopSum(new int[] {-1, 2, -1}, 7));
		assertEquals(16, sum.loopSum(new int[] {1, 4, 5, 6}, 4));
		assertEquals(30, sum.loopSum(new int[] {3} , 10));
	}
}
