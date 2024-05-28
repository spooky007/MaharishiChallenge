import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestAdjacentSumTest {

	@Test
	void largestAdjacentSumTest() {
		LargestAdjacentSum sum = new LargestAdjacentSum();
		assertEquals(7, sum.largestAdjacentSum(new int[] {1, 2, 3, 4}));
		assertEquals(6, sum.largestAdjacentSum(new int[] {18, -12, 9, -10}));
		assertEquals(2, sum.largestAdjacentSum(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1}));
		assertEquals(3, sum.largestAdjacentSum(new int[] {1, 1, 1, 1, 1, 2, 1, 1, 1}));
	}
}
